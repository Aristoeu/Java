package datastructures.lists;

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
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get(0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = charSequence16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass16 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence21 = charSequenceCursorLinkedList0.get(2);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
        org.junit.Assert.assertNull(charSequence21);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.removeByIndex(1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass14 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) '4');
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        java.lang.Class<?> wildcardClass13 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "" + "'", charSequence8, "");
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        int int10 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass14 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        java.lang.CharSequence charSequence13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = charSequenceCursorLinkedList0.indexOf(charSequence13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8, "hi!");
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass21 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = charSequenceCursorLinkedList0.indexOf(charSequence17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = charSequence15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "hi!" + "'", charSequence10, "hi!");
        org.junit.Assert.assertNull(charSequence15);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.removeByIndex(10);
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence24 = charSequenceCursorLinkedList0.get((int) (short) 10);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "hi!" + "'", charSequence22, "hi!");
        org.junit.Assert.assertNull(charSequence24);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get(1);
        java.lang.CharSequence charSequence4 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8, "hi!");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence7 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass14 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = charSequence12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = charSequence20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertNull(charSequence20);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence3 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence5 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int9 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = charSequence11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        java.lang.CharSequence charSequence16 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove(charSequence16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get((int) (short) 0);
        int int24 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNull(charSequence22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence7 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        java.lang.Class<?> wildcardClass12 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((-1));
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (short) 10);
        int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass16 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = charSequenceCursorLinkedList0.indexOf(charSequence18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        java.lang.Class<?> wildcardClass22 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((-1));
        java.lang.Class<?> wildcardClass12 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        charSequenceCursorLinkedList0.removeByIndex(100);
        java.lang.Class<?> wildcardClass22 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int10 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass16 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        java.lang.CharSequence charSequence24 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass13 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        // The following exception was thrown during execution in test generation
        try {
            int int24 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.removeByIndex(10);
        java.lang.Class<?> wildcardClass14 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence3 = charSequenceCursorLinkedList0.get((int) '4');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "" + "'", charSequence8, "");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass21 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.Class<?> wildcardClass24 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = charSequence16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(2);
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        int int22 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        java.lang.Class<?> wildcardClass21 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence3 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence5 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence7 = charSequenceCursorLinkedList0.get((int) '#');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (short) 1);
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence27 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.Class<?> wildcardClass28 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence22);
        org.junit.Assert.assertNull(charSequence27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass23 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) (short) -1);
        java.lang.CharSequence charSequence21 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        int int23 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNull(charSequence21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        java.lang.CharSequence charSequence28 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass29 = charSequence28.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(charSequence22);
        org.junit.Assert.assertNull(charSequence28);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence4 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass12 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get(1);
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence4 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        int int10 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(1);
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence15);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(1);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        int int9 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get(1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence21 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence23 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "hi!" + "'", charSequence21, "hi!");
        org.junit.Assert.assertNull(charSequence23);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.printList();
        int int23 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence15);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.Class<?> wildcardClass31 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(charSequence24);
        org.junit.Assert.assertEquals("'" + charSequence26 + "' != '" + "hi!" + "'", charSequence26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get(2);
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNull(charSequence15);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int6 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
            int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get(2);
        java.lang.Class<?> wildcardClass16 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        java.lang.CharSequence charSequence30 = charSequenceCursorLinkedList0.get((int) '#');
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(charSequence22);
        org.junit.Assert.assertNull(charSequence30);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        java.lang.Class<?> wildcardClass25 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get(2);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "" + "'", charSequence9, "");
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(2);
        java.lang.Class<?> wildcardClass16 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence5 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass13 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.Class<?> wildcardClass12 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = charSequence17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "hi!" + "'", charSequence10, "hi!");
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNull(charSequence17);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8, "hi!");
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.append(charSequence16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get(1);
        java.lang.Class<?> wildcardClass12 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8, "hi!");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence15);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(10);
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = charSequence22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence22);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence12 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.append(charSequence12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(2);
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "hi!" + "'", charSequence10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        int int30 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        int int32 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(charSequence24);
        org.junit.Assert.assertEquals("'" + charSequence26 + "' != '" + "hi!" + "'", charSequence26, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.append(charSequence12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "" + "'", charSequence9, "");
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        int int10 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (short) 100);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) '4');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass16 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        java.lang.CharSequence charSequence21 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.append(charSequence21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        charSequenceCursorLinkedList0.removeByIndex(2);
        java.lang.Class<?> wildcardClass20 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass5 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        int int21 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        java.lang.Class<?> wildcardClass22 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get(0);
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass16 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNull(charSequence17);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        int int19 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass22 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get(10);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        // The following exception was thrown during execution in test generation
        try {
            int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.removeByIndex(100);
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(charSequence24);
        org.junit.Assert.assertEquals("'" + charSequence26 + "' != '" + "hi!" + "'", charSequence26, "hi!");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(0);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass10 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.Class<?> wildcardClass13 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass20 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex(2);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get(10);
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) 'a');
        int int21 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = charSequence16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass14 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) '4');
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get((int) 'a');
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNull(charSequence22);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        int int26 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(charSequence20);
        org.junit.Assert.assertNull(charSequence22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get(100);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        int int9 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence3 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass6 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence3 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(0);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass16 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 10);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get((int) '4');
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence15);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int10 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get(2);
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get(0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "hi!" + "'", charSequence19, "hi!");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass8 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) '4');
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((-1));
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass16 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (short) 100);
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.append(charSequence11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        java.lang.Class<?> wildcardClass21 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (short) 100);
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass24 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(charSequence20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(2);
        java.lang.Class<?> wildcardClass10 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        java.lang.CharSequence charSequence22 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove(charSequence22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int10 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get(10);
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get((-1));
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNull(charSequence15);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) -1);
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.printList();
        int int21 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        java.lang.Class<?> wildcardClass12 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = charSequenceCursorLinkedList0.indexOf(charSequence15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
            java.lang.Class<?> wildcardClass14 = charSequence13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        int int22 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass23 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence3 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence5 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence7 = charSequenceCursorLinkedList0.get((int) '4');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        java.lang.CharSequence charSequence28 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(charSequence24);
        org.junit.Assert.assertNull(charSequence28);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        java.lang.Class<?> wildcardClass20 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get(2);
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (short) -1);
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get((-1));
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertNull(charSequence20);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int10 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass12 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        int int21 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNull(charSequence22);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        java.lang.CharSequence charSequence21 = charSequenceCursorLinkedList0.get(0);
        java.lang.Class<?> wildcardClass22 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertNull(charSequence21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        java.lang.Class<?> wildcardClass23 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8, "hi!");
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNull(charSequence22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
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
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        java.lang.Class<?> wildcardClass22 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "hi!" + "'", charSequence19, "hi!");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        java.lang.Class<?> wildcardClass14 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        java.lang.Class<?> wildcardClass20 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((-1));
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.printList();
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence21 = charSequenceCursorLinkedList0.get((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass26 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNull(charSequence21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get(0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(charSequence22);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((-1));
        java.lang.Class<?> wildcardClass14 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass13 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get((int) 'a');
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence20);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        java.lang.CharSequence charSequence21 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.Class<?> wildcardClass24 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNull(charSequence21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        int int24 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        java.lang.CharSequence charSequence19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = charSequenceCursorLinkedList0.indexOf(charSequence19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get(1);
        java.lang.CharSequence charSequence4 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((-1));
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        charSequenceCursorLinkedList0.removeByIndex(2);
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get((int) (short) 1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNull(charSequence22);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        java.lang.Class<?> wildcardClass11 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "" + "'", charSequence8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        java.lang.CharSequence charSequence25 = charSequenceCursorLinkedList0.get(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = charSequence25.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNull(charSequence25);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = charSequence16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "" + "'", charSequence8, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        int int19 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence21 = charSequenceCursorLinkedList0.get((int) '4');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(charSequence21);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get((int) '4');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        java.lang.CharSequence charSequence25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = charSequenceCursorLinkedList0.indexOf(charSequence25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(charSequence20);
        org.junit.Assert.assertNull(charSequence22);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        java.lang.CharSequence charSequence22 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove(charSequence22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (short) 10);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int26 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass24 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
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
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((-1));
        charSequenceCursorLinkedList0.removeByIndex((-1));
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        int int21 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence23 = charSequenceCursorLinkedList0.get((int) (short) 10);
        java.lang.CharSequence charSequence24 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove(charSequence24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(charSequence23);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "" + "'", charSequence9, "");
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        java.lang.Class<?> wildcardClass21 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get(100);
        java.lang.Class<?> wildcardClass20 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.printList();
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get(1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence17);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        int int22 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass23 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.removeByIndex(0);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence21 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence23 = charSequenceCursorLinkedList0.get((int) ' ');
        int int25 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "hi!" + "'", charSequence21, "hi!");
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get((int) '#');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(charSequence20);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) '#');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((-1));
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "" + "'", charSequence9, "");
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass20 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = charSequence14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence4 = charSequenceCursorLinkedList0.get((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass24 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex(100);
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "" + "'", charSequence8, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence15 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.append(charSequence15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(10);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
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
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass11 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass7 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) '#');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((-1));
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = charSequence18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass21 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((-1));
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass12 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "" + "'", charSequence9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = charSequence16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex(2);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass16 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        int int19 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get((int) (short) 10);
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get((int) '#');
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence20);
        org.junit.Assert.assertNull(charSequence22);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(10);
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        // The following exception was thrown during execution in test generation
        try {
            int int28 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(charSequence24);
        org.junit.Assert.assertNull(charSequence26);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 10);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(10);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass23 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get(100);
        java.lang.CharSequence charSequence14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = charSequenceCursorLinkedList0.indexOf(charSequence14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) '4');
        java.lang.CharSequence charSequence17 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove(charSequence17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.append(charSequence11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(10);
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) '4');
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        java.lang.Class<?> wildcardClass20 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        java.lang.CharSequence charSequence21 = charSequenceCursorLinkedList0.get((int) '#');
        java.lang.Class<?> wildcardClass22 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(charSequence21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((-1));
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
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (short) -1);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 100);
        java.lang.Class<?> wildcardClass12 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "" + "'", charSequence9, "");
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass12 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass16 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
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
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        java.lang.CharSequence charSequence21 = charSequenceCursorLinkedList0.get((int) '#');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(charSequence21);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        java.lang.CharSequence charSequence22 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove(charSequence22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(10);
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass11 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8, "hi!");
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        int int28 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(charSequence22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        int int19 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass20 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int22 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        java.lang.CharSequence charSequence19 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove(charSequence19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence7 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(2);
        charSequenceCursorLinkedList0.removeByIndex(100);
        java.lang.Class<?> wildcardClass16 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        // The following exception was thrown during execution in test generation
        try {
            int int23 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) '4');
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) ' ');
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (short) 0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        java.lang.CharSequence charSequence28 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(charSequence24);
        org.junit.Assert.assertNull(charSequence28);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        java.lang.Class<?> wildcardClass27 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(charSequence20);
        org.junit.Assert.assertNull(charSequence22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence23 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertEquals("'" + charSequence23 + "' != '" + "" + "'", charSequence23, "");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        java.lang.CharSequence charSequence23 = charSequenceCursorLinkedList0.get((int) '4');
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence23);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex(2);
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass13 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(10);
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
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        java.lang.Class<?> wildcardClass25 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(charSequence22);
        org.junit.Assert.assertNull(charSequence24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        java.lang.CharSequence charSequence22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = charSequenceCursorLinkedList0.indexOf(charSequence22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.removeByIndex((-1));
        java.lang.Class<?> wildcardClass13 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence27 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        java.lang.CharSequence charSequence29 = charSequenceCursorLinkedList0.get(100);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence22);
        org.junit.Assert.assertNull(charSequence27);
        org.junit.Assert.assertNull(charSequence29);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence4 = charSequenceCursorLinkedList0.get((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(10);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get(0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        java.lang.CharSequence charSequence19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = charSequenceCursorLinkedList0.indexOf(charSequence19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        java.lang.Class<?> wildcardClass22 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNull(charSequence21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        java.lang.Class<?> wildcardClass14 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int7 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence15);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        int int19 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence21 = charSequenceCursorLinkedList0.get(1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "hi!" + "'", charSequence21, "hi!");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(100);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        int int24 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "hi!" + "'", charSequence20, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass16 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(100);
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8, "hi!");
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((-1));
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get(0);
        int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) '4');
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get(1);
        java.lang.CharSequence charSequence4 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int21 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass14 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8, "hi!");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get(1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertNull(charSequence20);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass14 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

