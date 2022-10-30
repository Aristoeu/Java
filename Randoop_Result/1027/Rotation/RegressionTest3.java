package Rotation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
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
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (short) 0);
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
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
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
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
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
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 100);
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
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
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
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, (int) (byte) 10, 0);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
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
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) -1);
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
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
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
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 100);
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
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray4, 10);
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
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 10);
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
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 10);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
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
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 100);
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
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
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
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) ' ', 0);
        java.lang.Class<?> wildcardClass16 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aa#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aa#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, #, a]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
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
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
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
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 100);
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
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
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
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
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
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
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
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
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
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
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
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (short) 10);
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
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
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
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
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
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (-1));
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
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
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
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
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
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, a, a, a]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
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
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 10);
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
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
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
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
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
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
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
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 10);
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
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
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
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) '#');
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
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
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
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
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
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
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
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray0, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 10);
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
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        char[] charArray1 = new char[] { 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray1, (int) 'a', (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[a]");
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, 1);
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
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (byte) 0);
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
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray0, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 1);
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
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) '4');
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
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
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
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) -1);
        java.lang.Class<?> wildcardClass34 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
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
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
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
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '#');
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
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
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
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
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) -1);
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
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 100);
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
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
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
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        char[] charArray1 = new char[] { ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray1, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ]");
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) 'a');
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
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
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
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) '4');
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
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
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
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
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
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
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
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) -1);
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
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 100);
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
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 10);
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
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
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
        java.lang.Class<?> wildcardClass35 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '#');
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
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
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
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 1);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 100);
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
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
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
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
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
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 100);
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
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, 10, 0);
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 10);
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
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
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
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
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
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, 1);
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
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
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
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 100);
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
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) -1);
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
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
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
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (-1));
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
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, 100);
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
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
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
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
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
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, 1);
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
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), 100);
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
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
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
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) ' ');
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
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 100);
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
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
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
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 100);
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
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 100);
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
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 1);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) ' ');
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
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) -1);
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
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
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
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
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
        java.lang.Class<?> wildcardClass42 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
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
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
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
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) '4');
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
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) 'a');
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
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
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
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 0);
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
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
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
        java.lang.Class<?> wildcardClass35 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
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
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
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
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) -1);
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
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) '4');
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
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
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
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
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
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
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
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) 100);
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
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) 'a');
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
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) '#');
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
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
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
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 10);
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
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) 10);
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
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 100);
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
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, 0);
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
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 1);
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
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 100);
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
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray4, 0, (int) ' ');
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
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) '4');
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
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
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
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
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
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
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
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
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
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
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
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
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
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass12 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass15 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
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
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) ' ');
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
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 0);
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
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
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
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) '#');
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
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '#');
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
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 100);
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
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) 'a');
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
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) 100);
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
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 100);
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
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 10);
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
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
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
        java.lang.Class<?> wildcardClass36 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
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
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
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
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 10);
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
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 10);
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
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 100, (-1));
        java.lang.Class<?> wildcardClass20 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, a, a, a]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
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
        java.lang.Class<?> wildcardClass29 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass29 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
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
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) '4');
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
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
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
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, 1);
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
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
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
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
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
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass37 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
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
        java.lang.Class<?> wildcardClass29 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
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
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (short) 10);
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
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
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
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
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
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
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
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 0);
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
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) '4');
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, 100);
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
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
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
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 10);
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
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
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
        java.lang.Class<?> wildcardClass38 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
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
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
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
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) ' ');
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
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
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
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
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
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, 1);
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
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
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
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '#');
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) ' ');
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
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass18 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
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
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 10);
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
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
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
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
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
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
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
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) -1);
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
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 10);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) 0);
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
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
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
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 100);
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
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
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
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
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
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 10);
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
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
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
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) '#');
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
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
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
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) 'a');
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
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
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
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
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
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
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
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
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
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
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
        java.lang.Class<?> wildcardClass36 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 10);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, (int) '4', 1);
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
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
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        java.lang.Class<?> wildcardClass16 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
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
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 100);
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
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '#');
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass16 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
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
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 100);
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
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
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
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray0, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) ' ');
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
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
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
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
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
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 10);
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
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
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
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
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
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 100);
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
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) '4');
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
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 100);
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
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
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
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
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
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass16 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) '4');
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
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
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
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        java.lang.Class<?> wildcardClass15 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) -1);
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
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
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
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
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
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray0, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 100);
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
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 1);
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
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
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
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
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
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) 'a');
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
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 10);
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
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
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
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
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
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) 'a');
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
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) '#');
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
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
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
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
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
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, (int) (short) 1, 0);
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
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
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
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
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
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
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
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
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
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
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
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
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass14 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
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
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
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
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 100);
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
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray4, (int) ' ');
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
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
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
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 10);
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
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 0);
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
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (short) 100);
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
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 1);
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
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
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
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 100);
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
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
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
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
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
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) '4');
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
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) ' ');
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
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
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
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 10);
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
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 1, 100);
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
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) '#');
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
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 100);
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
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray4, (int) '4');
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
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 100);
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
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) '4');
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
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
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
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
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
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray0, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
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
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
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
        java.lang.Class<?> wildcardClass29 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray0, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
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
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) '#');
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
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
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
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
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
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
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
            com.thealgorithms.strings.Rotation.rotation(charArray3, (-1));
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
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
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
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 10);
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
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
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
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass15 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
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
        java.lang.Class<?> wildcardClass36 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
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
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
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
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) '4');
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
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) '4');
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
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 100);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass14 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
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
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
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
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
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
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
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
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
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
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
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
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
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
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
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
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
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
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass16 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) ' ');
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
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
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
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
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
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
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
        java.lang.Class<?> wildcardClass39 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
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
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, 100);
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
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
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
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) '4');
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
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
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
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, 0);
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
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
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
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) 'a');
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
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
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
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '4');
        java.lang.Class<?> wildcardClass18 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 10);
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
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 1);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
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
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
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
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) ' ');
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
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
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
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 0);
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
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
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
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
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
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
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
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
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
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (byte) 0);
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
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
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
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) '#');
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
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
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
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
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
        java.lang.Class<?> wildcardClass45 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }
}

