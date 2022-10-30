package Rotation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

    public static boolean debug = false;

    @Test
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10001");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 100);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass18 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , 4]");
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass35 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        java.lang.Class<?> wildcardClass43 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass35 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '4');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass34 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass34 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aa#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aa#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, #, a]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass45 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10084");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10085");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray0, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10086");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10087");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10088");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10089");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray4, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, a, a, a]");
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10090");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10091");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10092");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10093");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10094");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10095");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10096");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10097");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10098");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10099");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10100");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10101");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10102");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10103");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10104");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10105");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10106");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10107");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10108");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 1);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10109");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10110");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10111");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass39 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10112");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10113");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) '#');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10114");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '#');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10115");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10116");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        java.lang.Class<?> wildcardClass18 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10117");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10118");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10119");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10120");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10121");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass35 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10122");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10123");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10124");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass35 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10125");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '#');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 100);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10126");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10127");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10128");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10129");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10130");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10131");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10132");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10133");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10134");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10135");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10136");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10137");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10138");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10139");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10140");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10141");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass43 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10142");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, (int) ' ', 10);
    }

    @Test
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10143");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10144");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10145");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10146");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10147");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10148");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '#');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass29 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10149");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10150");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10151");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass45 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10152");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10153");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10154");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10155");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10156");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10157");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10158");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10159");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10160");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10161");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10162");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10163");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10164");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass36 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10165");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass37 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10166");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10167");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10168");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10169");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10170");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10171");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10172");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10173");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10174");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10175");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10176");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10177");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10178");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }
}

