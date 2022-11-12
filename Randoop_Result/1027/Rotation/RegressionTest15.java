package Rotation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test07501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07501");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test07502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07502");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 100);
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
    public void test07503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07503");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (short) 0);
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
    public void test07504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07504");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07505");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test07506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07506");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test07507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07507");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07508");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 100);
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
    public void test07509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07509");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
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
    public void test07510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07510");
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
    public void test07511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07511");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test07512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07512");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test07513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07513");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) -1);
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
    public void test07514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07514");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07515");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07516");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 10);
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
    public void test07517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07517");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test07518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07518");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
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
    public void test07519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07519");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '#');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test07520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07520");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 1);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test07521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07521");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 10);
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
    public void test07522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07522");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass29 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test07523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07523");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07524");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test07525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07525");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test07526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07526");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test07527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07527");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test07528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07528");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 10);
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
    public void test07529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07529");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
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
    public void test07530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07530");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) '#');
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
    public void test07531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07531");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
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
    public void test07532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07532");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) ' ');
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
    public void test07533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07533");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test07534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07534");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test07535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07535");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test07536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07536");
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
        java.lang.Class<?> wildcardClass40 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test07537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07537");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test07538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07538");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) ' ');
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
    public void test07539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07539");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 100);
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
    public void test07540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07540");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test07541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07541");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07542");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test07543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07543");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test07544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07544");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) ' ');
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
    public void test07545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07545");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test07546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07546");
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
    public void test07547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07547");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), 100);
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
    public void test07548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07548");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
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
    public void test07549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07549");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 10);
        java.lang.Class<?> wildcardClass34 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test07550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07550");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
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
    public void test07551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07551");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test07552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07552");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, 0);
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
    public void test07553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07553");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
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
    public void test07554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07554");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass37 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test07555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07555");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 10);
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

    @Test
    public void test07556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07556");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
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
    public void test07557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07557");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07558");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test07559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07559");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07560");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
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
    public void test07561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07561");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07562");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07563");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test07564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07564");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 100);
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
    public void test07565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07565");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 10);
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
    public void test07566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07566");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
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
    public void test07567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07567");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray0, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07568");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test07569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07569");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test07570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07570");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07571");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 10);
        java.lang.Class<?> wildcardClass34 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test07572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07572");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '#');
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
    public void test07573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07573");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
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
    public void test07574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07574");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test07575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07575");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '4');
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test07576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07576");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
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
    public void test07577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07577");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
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
    public void test07578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07578");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test07579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07579");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass35 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test07580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07580");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test07581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07581");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test07582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07582");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray0, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07583");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, (int) (byte) 10, 1);
    }

    @Test
    public void test07584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07584");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray0, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07585");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 100);
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
    public void test07586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07586");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07587");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (short) 100);
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
    public void test07588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07588");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test07589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07589");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07590");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test07591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07591");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 10);
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
    public void test07592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07592");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass38 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test07593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07593");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test07594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07594");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 10);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test07595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07595");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) -1);
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
    public void test07596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07596");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test07597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07597");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 1);
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test07598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07598");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test07599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07599");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) '#');
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
    public void test07600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07600");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test07601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07601");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 10);
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
    public void test07602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07602");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
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
    public void test07603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07603");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test07604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07604");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07605");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test07606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07606");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
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
    public void test07607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07607");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test07608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07608");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07609");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test07610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07610");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 1);
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
    public void test07611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07611");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test07612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07612");
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
        java.lang.Class<?> wildcardClass29 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test07613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07613");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray4, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, a, a, a]");
    }

    @Test
    public void test07614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07614");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test07615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07615");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test07616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07616");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) -1);
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
    public void test07617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07617");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test07618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07618");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        java.lang.Class<?> wildcardClass12 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07619");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) -1);
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
    public void test07620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07620");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test07621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07621");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test07622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07622");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07623");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test07624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07624");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test07625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07625");
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
        java.lang.Class<?> wildcardClass34 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test07626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07626");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '#');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test07627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07627");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test07628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07628");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
    }

    @Test
    public void test07629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07629");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
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
    public void test07630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07630");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 10);
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
    public void test07631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07631");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test07632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07632");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
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
    public void test07633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07633");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test07634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07634");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 100);
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
    public void test07635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07635");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
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
    public void test07636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07636");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
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
    public void test07637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07637");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
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
    public void test07638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07638");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) '#');
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
    public void test07639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07639");
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
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) -1);
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
    public void test07640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07640");
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
    public void test07641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07641");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 10);
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
    public void test07642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07642");
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
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test07643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07643");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test07644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07644");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 100);
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
    public void test07645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07645");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07646");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 10);
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
    public void test07647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07647");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (short) 100);
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
    public void test07648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07648");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test07649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07649");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test07650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07650");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test07651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07651");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) '4');
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
    public void test07652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07652");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07653");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test07654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07654");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07655");
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
    public void test07656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07656");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test07657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07657");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07658");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07659");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 10);
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
    public void test07660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07660");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07661");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
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
    public void test07662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07662");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test07663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07663");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
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
    public void test07664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07664");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test07665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07665");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07666");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test07667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07667");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test07668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07668");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test07669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07669");
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
    public void test07670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07670");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07671");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, (int) '4', (int) (short) -1);
    }

    @Test
    public void test07672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07672");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) 1);
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
    public void test07673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07673");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test07674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07674");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07675");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) -1);
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
    public void test07676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07676");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 100);
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
    public void test07677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07677");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 100);
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
    public void test07678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07678");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) -1);
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
    public void test07679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07679");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test07680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07680");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
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
    public void test07681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07681");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass53 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test07682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07682");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07683");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
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
    public void test07684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07684");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass36 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test07685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07685");
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
    public void test07686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07686");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test07687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07687");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test07688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07688");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test07689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07689");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) 'a');
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
    public void test07690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07690");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test07691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07691");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) -1);
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test07692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07692");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 100);
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
    public void test07693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07693");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07694");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test07695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07695");
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
    public void test07696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07696");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 100);
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
    public void test07697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07697");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 10);
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
    public void test07698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07698");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test07699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07699");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
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
    public void test07700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07700");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
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
    public void test07701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07701");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass40 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test07702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07702");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 1, (int) 'a');
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
    public void test07703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07703");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test07704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07704");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test07705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07705");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) '#');
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
    public void test07706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07706");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, 10, (int) (short) 10);
    }

    @Test
    public void test07707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07707");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test07708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07708");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test07709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07709");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07710");
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
        java.lang.Class<?> wildcardClass35 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test07711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07711");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test07712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07712");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
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
    public void test07713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07713");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (short) 10);
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
    public void test07714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07714");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) ' ');
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test07715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07715");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test07716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07716");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) '4');
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
    public void test07717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07717");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) 'a');
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
    public void test07718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07718");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), 1);
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
    public void test07719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07719");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
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
    public void test07720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07720");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test07721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07721");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test07722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07722");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
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
    public void test07723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07723");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test07724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07724");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 10);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test07725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07725");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07726");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test07727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07727");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test07728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07728");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test07729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07729");
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
    public void test07730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07730");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test07731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07731");
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
    public void test07732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07732");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
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
    public void test07733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07733");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07734");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) 'a');
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
    public void test07735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07735");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test07736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07736");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test07737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07737");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '#');
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
    public void test07738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07738");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) '#');
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
    public void test07739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07739");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07740");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
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
    public void test07741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07741");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
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
    public void test07742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07742");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
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
    public void test07743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07743");
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
    public void test07744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07744");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test07745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07745");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '#');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test07746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07746");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '4');
        java.lang.Class<?> wildcardClass37 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test07747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07747");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 100);
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
    public void test07748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07748");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 100);
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
    public void test07749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07749");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07750");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
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
    public void test07751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07751");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) '4');
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
    public void test07752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07752");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 10);
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
    public void test07753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07753");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test07754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07754");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test07755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07755");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test07756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07756");
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
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test07757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07757");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a#aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a#aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, #, a, a]");
    }

    @Test
    public void test07758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07758");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07759");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '#');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test07760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07760");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test07761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07761");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 0, (int) (byte) 10);
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
    public void test07762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07762");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test07763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07763");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test07764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07764");
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
    public void test07765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07765");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (-1));
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test07766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07766");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test07767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07767");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test07768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07768");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test07769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07769");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test07770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07770");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 10);
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
    public void test07771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07771");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) '4');
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
    public void test07772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07772");
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
    public void test07773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07773");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test07774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07774");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07775");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
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
    public void test07776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07776");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass50 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test07777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07777");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test07778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07778");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test07779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07779");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
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
    public void test07780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07780");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test07781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07781");
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
    public void test07782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07782");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 0);
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
    public void test07783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07783");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test07784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07784");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07785");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07786");
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
    public void test07787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07787");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 100);
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
    public void test07788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07788");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test07789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07789");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (-1));
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
    public void test07790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07790");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
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
    public void test07791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07791");
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
        java.lang.Class<?> wildcardClass38 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test07792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07792");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) '4');
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
    public void test07793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07793");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), 0);
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
    public void test07794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07794");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07795");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (-1));
        java.lang.Class<?> wildcardClass16 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07796");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test07797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07797");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07798");
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
        java.lang.Class<?> wildcardClass35 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test07799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07799");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test07800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07800");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test07801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07801");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
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
    public void test07802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07802");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test07803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07803");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test07804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07804");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray0, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07805");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test07806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07806");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass40 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test07807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07807");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) 'a');
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
    public void test07808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07808");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test07809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07809");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) -1);
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
    public void test07810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07810");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 10);
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
    public void test07811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07811");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) 10);
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
    public void test07812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07812");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test07813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07813");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 1, (int) (byte) 0);
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
    public void test07814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07814");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test07815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07815");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 100);
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
    public void test07816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07816");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
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
    public void test07817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07817");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 100);
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
    public void test07818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07818");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07819");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test07820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07820");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) ' ');
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
    public void test07821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07821");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test07822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07822");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) ' ');
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
    public void test07823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07823");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass29 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test07824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07824");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (short) 1);
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
    public void test07825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07825");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        java.lang.Class<?> wildcardClass37 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test07826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07826");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test07827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07827");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 10);
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
    public void test07828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07828");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test07829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07829");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test07830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07830");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 100);
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
    public void test07831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07831");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) '#');
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
    public void test07832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07832");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '4', 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aaa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aaa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, a, #]");
    }

    @Test
    public void test07833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07833");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (short) -1);
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
    public void test07834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07834");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 100);
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
    public void test07835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07835");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 10);
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
    public void test07836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07836");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
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
    public void test07837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07837");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test07838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07838");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 1);
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
    public void test07839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07839");
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
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) ' ');
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
    public void test07840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07840");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) '4');
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
    public void test07841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07841");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test07842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07842");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) ' ');
        java.lang.Class<?> wildcardClass34 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test07843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07843");
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
        java.lang.Class<?> wildcardClass29 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test07844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07844");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) -1);
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
    public void test07845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07845");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test07846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07846");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), 100);
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
    public void test07847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07847");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 100);
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
    public void test07848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07848");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test07849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07849");
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
    public void test07850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07850");
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
        java.lang.Class<?> wildcardClass37 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test07851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07851");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass36 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test07852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07852");
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
    public void test07853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07853");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test07854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07854");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test07855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07855");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07856");
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
    public void test07857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07857");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 100);
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
    public void test07858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07858");
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
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, 1);
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
    public void test07859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07859");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 10);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test07860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07860");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) ' ');
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
    public void test07861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07861");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aaa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aaa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, a, #]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test07862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07862");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) '4');
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
    public void test07863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07863");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) 'a');
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
    public void test07864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07864");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07865");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test07866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07866");
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
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) '4');
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
    public void test07867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07867");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
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
    public void test07868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07868");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07869");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) '#');
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
    public void test07870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07870");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07871");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) ' ');
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
    public void test07872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07872");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 100);
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
    public void test07873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07873");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
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
    public void test07874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07874");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test07875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07875");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
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
    public void test07876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07876");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07877");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) ' ');
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
    public void test07878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07878");
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
    public void test07879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07879");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test07880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07880");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 100);
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
    public void test07881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07881");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '#');
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
    public void test07882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07882");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test07883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07883");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07884");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
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
    public void test07885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07885");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
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
    public void test07886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07886");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 100);
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
    public void test07887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07887");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test07888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07888");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), 1);
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
    public void test07889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07889");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test07890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07890");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
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
    public void test07891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07891");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
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
    public void test07892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07892");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 100);
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
    public void test07893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07893");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
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
    public void test07894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07894");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07895");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) -1);
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
    public void test07896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07896");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test07897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07897");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07898");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test07899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07899");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '#');
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
    public void test07900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07900");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) '4');
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
    public void test07901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07901");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) 'a');
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
    public void test07902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07902");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test07903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07903");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 0);
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
    public void test07904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07904");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test07905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07905");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 1);
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
    public void test07906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07906");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 100);
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
    public void test07907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07907");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test07908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07908");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 100);
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
    public void test07909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07909");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07910");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) ' ');
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
    public void test07911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07911");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
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
    public void test07912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07912");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 100);
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
    public void test07913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07913");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (short) 10);
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
    public void test07914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07914");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 0);
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
    public void test07915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07915");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) -1);
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
    public void test07916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07916");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 1);
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
    public void test07917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07917");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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

    @Test
    public void test07918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07918");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07919");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07920");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test07921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07921");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
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
    public void test07922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07922");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) -1);
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
    public void test07923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07923");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07924");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 10);
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
    public void test07925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07925");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #,  ]");
    }

    @Test
    public void test07926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07926");
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
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test07927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07927");
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
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 10);
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
    public void test07928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07928");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test07929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07929");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07930");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test07931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07931");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test07932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07932");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass43 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test07933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07933");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) -1);
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
    public void test07934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07934");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test07935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07935");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aaa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aaa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, a, #]");
    }

    @Test
    public void test07936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07936");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass34 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test07937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07937");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07938");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) ' ');
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
    public void test07939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07939");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), 1);
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
    public void test07940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07940");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test07941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07941");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 100);
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
    public void test07942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07942");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
    }

    @Test
    public void test07943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07943");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test07944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07944");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a#aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a#aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, #, a, a]");
    }

    @Test
    public void test07945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07945");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 100);
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
    public void test07946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07946");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07947");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test07948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07948");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07949");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
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
    public void test07950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07950");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , 4]");
    }

    @Test
    public void test07951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07951");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test07952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07952");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 10);
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
    public void test07953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07953");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
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
    public void test07954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07954");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07955");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07956");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray4, (-1));
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
    public void test07957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07957");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 10);
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
    public void test07958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07958");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) '#');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07959");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test07960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07960");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) '#');
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
    public void test07961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07961");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (-1));
        java.lang.Class<?> wildcardClass34 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test07962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07962");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
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
    public void test07963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07963");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test07964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07964");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (byte) -1);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test07965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07965");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test07966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07966");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test07967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07967");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test07968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07968");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test07969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07969");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 10);
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
    public void test07970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07970");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (short) 0);
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
    public void test07971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07971");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test07972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07972");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (-1));
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test07973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07973");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test07974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07974");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test07975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07975");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
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
    public void test07976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07976");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 10);
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
    public void test07977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07977");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
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

    @Test
    public void test07978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07978");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
    }

    @Test
    public void test07979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07979");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass34 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test07980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07980");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test07981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07981");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test07982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07982");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 100);
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
    public void test07983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07983");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07984");
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
    public void test07985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07985");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (short) -1);
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
    public void test07986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07986");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 10);
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
    public void test07987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07987");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) '4');
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
    public void test07988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07988");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
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
    public void test07989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07989");
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
    public void test07990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07990");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) 'a');
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
    public void test07991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07991");
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
        java.lang.Class<?> wildcardClass29 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test07992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07992");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07993");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
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
    public void test07994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07994");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test07995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07995");
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
        java.lang.Class<?> wildcardClass45 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test07996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07996");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) ' ');
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
    public void test07997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07997");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test07998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07998");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test07999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07999");
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
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) ' ');
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
    public void test08000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test08000");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }
}
