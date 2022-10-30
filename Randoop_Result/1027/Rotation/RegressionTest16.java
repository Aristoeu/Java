package Rotation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test08001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08001");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) ' ');
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
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08002");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass40 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08003");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) 'a');
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
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08004");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 10);
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
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08005");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08006");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08007");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
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
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08008");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08009");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) 100);
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
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08010");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08011");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08012");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) -1);
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
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08013");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) ' ');
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08014");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08015");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, 10, (int) (byte) -1);
    }

    @Test
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08016");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08017");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08018");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
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
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08019");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08020");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08021");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08022");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 100);
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
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08023");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08024");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) -1);
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
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08025");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08026");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
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
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08027");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08028");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08029");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
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
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08030");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08031");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08032");
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
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08033");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08034");
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
        java.lang.Class<?> wildcardClass37 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08035");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08036");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08037");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass39 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08038");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) ' ');
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
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08039");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08040");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08041");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) ' ');
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
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08042");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '4', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) 'a', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, a, a, a]");
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08043");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (short) 100);
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
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08044");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) -1);
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
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08045");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 10);
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
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08046");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), 10);
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
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08047");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08048");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) 'a');
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
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08049");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) '4');
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
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08050");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) '4');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08051");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (-1));
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08052");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08053");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 100);
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
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08054");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass39 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08055");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08056");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) ' ');
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
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08057");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08058");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08059");
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
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08060");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08061");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) 'a');
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
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08062");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) -1);
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
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08063");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08064");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08065");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 100);
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
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08066");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08067");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
    }

    @Test
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08068");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " 4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " 4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , 4, #]");
    }

    @Test
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08069");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08070");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08071");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
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
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08072");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08073");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
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
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08074");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
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
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08075");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08076");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08077");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08078");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass38 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08079");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08080");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08081");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08082");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (short) 0);
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
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08083");
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
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) 'a');
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
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08084");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08085");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08086");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '#');
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08087");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08088");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) '#');
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
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08089");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 10);
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
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08090");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
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
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08091");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) -1);
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
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08092");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08093");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
    }

    @Test
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08094");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08095");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08096");
        char[] charArray1 = new char[] { 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray1, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray1, (int) (byte) 100, (int) 'a');
        java.lang.Class<?> wildcardClass8 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[a]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08097");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) 'a');
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
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08098");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) 'a');
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
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08099");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08100");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) -1);
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
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08101");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
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
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08102");
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
        java.lang.Class<?> wildcardClass29 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08103");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 0);
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
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08104");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08105");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) 'a');
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
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08106");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) '#');
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
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08107");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass35 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08108");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '#');
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
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08109");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08110");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 100);
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
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08111");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) 'a', (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aa#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aa#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, #, a]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08112");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08113");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (-1));
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
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08114");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08115");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08116");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08117");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) -1);
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
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08118");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08119");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08120");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
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
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08121");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '#');
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
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08122");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '#');
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
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08123");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08124");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08125");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 100);
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
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08126");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
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
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08127");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08128");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08129");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 100);
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
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08130");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08131");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
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
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08132");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 100);
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
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08133");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08134");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08135");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) 'a');
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
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08136");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08137");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
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
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08138");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08139");
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
            com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 100);
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
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08140");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08141");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08142");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08143");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '4', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '4', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray4, 100);
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
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08144");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08145");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) 'a');
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
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08146");
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
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 100);
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
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08147");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) -1);
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
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08148");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) -1);
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
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08149");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 10);
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
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08150");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
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
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08151");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
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
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08152");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) '#');
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
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08153");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08154");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08155");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
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
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08156");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, 1, 1);
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08157");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
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
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08158");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (-1));
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
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08159");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass38 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08160");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08161");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08162");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, 10);
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
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08163");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 100);
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
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08164");
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
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08165");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '#');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08166");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08167");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 1);
        java.lang.Class<?> wildcardClass29 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08168");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 100);
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
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08169");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08170");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08171");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08172");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08173");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08174");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08175");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08176");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08177");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08178");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08179");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (short) 100);
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
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08180");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 100);
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
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08181");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08182");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass41 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08183");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) ' ');
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
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08184");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08185");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08186");
        char[] charArray1 = new char[] { ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray1, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray1, 10, (-1));
        java.lang.Class<?> wildcardClass10 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08187");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 100);
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
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08188");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) '#');
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
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08189");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08190");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 100);
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
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08191");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08192");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08193");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08194");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08195");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08196");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
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
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08197");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08198");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 100);
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
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08199");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) ' ');
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
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08200");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08201");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08202");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08203");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08204");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
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
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08205");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08206");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08207");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 10);
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
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08208");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08209");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08210");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08211");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) ' ');
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
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08212");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 100);
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
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08213");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
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
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08214");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
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
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08215");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
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
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08216");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) 'a');
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
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08217");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08218");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08219");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08220");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
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
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08221");
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
        java.lang.Class<?> wildcardClass35 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08222");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08223");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08224");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 10);
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
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08225");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08226");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08227");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) '#');
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
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08228");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08229");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) ' ');
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
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08230");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass36 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08231");
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
        java.lang.Class<?> wildcardClass35 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08232");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (byte) 100);
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
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08233");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08234");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08235");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08236");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 100);
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
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08237");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
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
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08238");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) '#');
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
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08239");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 100);
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
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08240");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08241");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08242");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08243");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 100);
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
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08244");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (short) 1);
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
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08245");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08246");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08247");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , 4]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08248");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass36 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08249");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08250");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
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
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08251");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 1);
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
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08252");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08253");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (-1));
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
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08254");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08255");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 100);
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
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08256");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08257");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) 'a');
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
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08258");
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
        java.lang.Class<?> wildcardClass44 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08259");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aa#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aa#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, #, a]");
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08260");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
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
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08261");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '#');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08262");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
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
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08263");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
    }

    @Test
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08264");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08265");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08266");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 100);
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
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08267");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08268");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08269");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08270");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08271");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08272");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '#');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
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
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08273");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08274");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08275");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
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
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08276");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 100);
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
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08277");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08278");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (-1));
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08279");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08280");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08281");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08282");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08283");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) -1);
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
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08284");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass38 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08285");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08286");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08287");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08288");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08289");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass39 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08290");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '#');
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
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08291");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 100);
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
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08292");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08293");
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
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08294");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08295");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08296");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08297");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08298");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
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
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08299");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08300");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '4', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aaa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aaa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, a, #]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08301");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) 100);
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
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08302");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) -1);
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
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08303");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 1);
        java.lang.Class<?> wildcardClass34 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08304");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08305");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) '4');
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
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08306");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (-1));
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
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08307");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass49 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08308");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '#');
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08309");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08310");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08311");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 10);
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
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08312");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08313");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
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
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08314");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
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
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08315");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        java.lang.Class<?> wildcardClass41 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08316");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08317");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
    }

    @Test
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08318");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 100);
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
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08319");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) '#');
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
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08320");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08321");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08322");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08323");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 100);
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
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08324");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08325");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08326");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
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
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08327");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08328");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08329");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '#');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08330");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 100);
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
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08331");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) 'a');
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
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08332");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) ' ');
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
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08333");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray0, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08334");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 10);
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
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08335");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08336");
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
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08337");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08338");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 100);
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
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08339");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08340");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (byte) 1);
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
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08341");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08342");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) '4');
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
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08343");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08344");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
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
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08345");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass35 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08346");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) -1);
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
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08347");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08348");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) 100);
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
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08349");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08350");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08351");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
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
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08352");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (-1));
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08353");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08354");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (-1));
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
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08355");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08356");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '4', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aaa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aaa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, a, #]");
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08357");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08358");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 100);
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
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08359");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) '#');
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
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08360");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 100);
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
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08361");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
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
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08362");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) '4');
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
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08363");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08364");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08365");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08366");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 1);
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
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08367");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08368");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08369");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) 'a');
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
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08370");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08371");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) ' ');
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
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08372");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08373");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 100);
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
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08374");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) '4');
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
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08375");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08376");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08377");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) ' ');
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
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08378");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08379");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass29 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08380");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (-1));
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
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08381");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
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
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08382");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08383");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08384");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08385");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08386");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) 'a');
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
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08387");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08388");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08389");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08390");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08391");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (byte) 100);
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
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08392");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08393");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08394");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) '#');
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
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08395");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 100);
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
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08396");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08397");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08398");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08399");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 1);
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
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08400");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08401");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
    }

    @Test
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08402");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) -1);
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
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08403");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08404");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08405");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 100);
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
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08406");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08407");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 100);
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
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08408");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08409");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08410");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08411");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08412");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
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
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08413");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) ' ');
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
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08414");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 100);
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
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08415");
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
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08416");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
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
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08417");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 10);
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
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08418");
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
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08419");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) 'a');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08420");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08421");
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
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08422");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
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
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08423");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08424");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 100);
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
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08425");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08426");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 10);
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
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08427");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08428");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08429");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08430");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 0);
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
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08431");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08432");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 0);
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
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08433");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) ' ');
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
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08434");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08435");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08436");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 10);
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
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08437");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, 100, (int) (byte) 100);
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08438");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass37 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08439");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08440");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08441");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
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
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08442");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08443");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), 10);
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
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08444");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
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
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08445");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08446");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08447");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08448");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) '4');
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
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08449");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 100);
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
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08450");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 100);
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
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08451");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, 100);
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
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08452");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (-1));
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
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08453");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 0);
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
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08454");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
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
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08455");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 100);
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
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08456");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass39 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08457");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 100);
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
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08458");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08459");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, 0);
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
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08460");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass38 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08461");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08462");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) ' ');
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
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08463");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (-1));
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
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08464");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08465");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08466");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08467");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08468");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08469");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) -1);
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
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08470");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08471");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08472");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), 0);
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
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08473");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08474");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 10);
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
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08475");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08476");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08477");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08478");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 100);
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
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08479");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 100);
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
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08480");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
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
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08481");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '#');
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08482");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08483");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08484");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08485");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08486");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 10);
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08487");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, 100);
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
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08488");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08489");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
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
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08490");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08491");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
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
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08492");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08493");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08494");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) -1);
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
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08495");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) 'a');
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
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08496");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08497");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 100);
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
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08498");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08499");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08500");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }
}

