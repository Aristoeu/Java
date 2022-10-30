package Rotation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

    public static boolean debug = false;

    @Test
    public void test09501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09501");
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
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test09502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09502");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test09503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09503");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09504");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test09505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09505");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test09506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09506");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) -1);
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
    public void test09507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09507");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test09508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09508");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09509");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) 'a');
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
    public void test09510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09510");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
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
    public void test09511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09511");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09512");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test09513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09513");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test09514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09514");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass18 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test09515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09515");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09516");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) '4');
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
    public void test09517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09517");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09518");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test09519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09519");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass37 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test09520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09520");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test09521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09521");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test09522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09522");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test09523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09523");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) 100);
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
    public void test09524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09524");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09525");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
    }

    @Test
    public void test09526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09526");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09527");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
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
    public void test09528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09528");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test09529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09529");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test09530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09530");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 10);
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
    public void test09531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09531");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
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
    public void test09532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09532");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test09533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09533");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09534");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09535");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09536");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test09537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09537");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test09538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09538");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09539");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
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
    public void test09540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09540");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 100);
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
    public void test09541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09541");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test09542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09542");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09543");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
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
    public void test09544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09544");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test09545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09545");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass39 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test09546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09546");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09547");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
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
    public void test09548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09548");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test09549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09549");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09550");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09551");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 100);
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
    public void test09552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09552");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test09553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09553");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09554");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
    }

    @Test
    public void test09555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09555");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 0);
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
    public void test09556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09556");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09557");
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
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test09558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09558");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 1);
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
    public void test09559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09559");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09560");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09561");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test09562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09562");
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
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test09563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09563");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
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
    public void test09564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09564");
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
    public void test09565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09565");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
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
    public void test09566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09566");
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
    public void test09567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09567");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test09568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09568");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
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
    public void test09569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09569");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass38 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test09570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09570");
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
    public void test09571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09571");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (short) 10);
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
    public void test09572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09572");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 10);
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
    public void test09573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09573");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test09574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09574");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
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
    public void test09575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09575");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
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
    public void test09576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09576");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test09577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09577");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
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
    public void test09578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09578");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test09579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09579");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 100);
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
    public void test09580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09580");
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
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test09581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09581");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass44 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test09582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09582");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09583");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test09584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09584");
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
    public void test09585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09585");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test09586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09586");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test09587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09587");
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
        java.lang.Class<?> wildcardClass42 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test09588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09588");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09589");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) 'a');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09590");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
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
    public void test09591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09591");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09592");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass34 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test09593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09593");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test09594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09594");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass15 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09595");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aa#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aa#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, #, a]");
    }

    @Test
    public void test09596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09596");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '#');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test09597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09597");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test09598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09598");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', (int) (short) 100);
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
    public void test09599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09599");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test09600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09600");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test09601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09601");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09602");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (byte) -1);
        java.lang.Class<?> wildcardClass38 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test09603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09603");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 100);
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
    public void test09604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09604");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 100);
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
    public void test09605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09605");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
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
    public void test09606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09606");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
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
    public void test09607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09607");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09608");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) -1);
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
    public void test09609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09609");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09610");
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
    public void test09611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09611");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test09612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09612");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test09613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09613");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '#');
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test09614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09614");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test09615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09615");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray4, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray4, (int) '#');
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
    public void test09616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09616");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test09617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09617");
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
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 10);
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
    public void test09618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09618");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09619");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 10);
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
    public void test09620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09620");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
    }

    @Test
    public void test09621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09621");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09622");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 10);
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
    public void test09623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09623");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) '4');
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
    public void test09624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09624");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, 100, (int) (short) 0);
    }

    @Test
    public void test09625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09625");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09626");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test09627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09627");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
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
    public void test09628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09628");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) '#');
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
    public void test09629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09629");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09630");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test09631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09631");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 0);
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
    public void test09632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09632");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) 'a');
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
    public void test09633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09633");
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
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test09634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09634");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test09635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09635");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test09636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09636");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09637");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test09638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09638");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
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
    public void test09639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09639");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09640");
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
    public void test09641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09641");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09642");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 100);
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
    public void test09643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09643");
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
    public void test09644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09644");
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
    public void test09645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09645");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
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
    public void test09646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09646");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '4', 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, a, a, a]");
    }

    @Test
    public void test09647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09647");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test09648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09648");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09649");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        java.lang.Class<?> wildcardClass16 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09650");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 10);
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
    public void test09651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09651");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
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
    public void test09652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09652");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test09653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09653");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test09654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09654");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09655");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test09656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09656");
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
    public void test09657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09657");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test09658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09658");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09659");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
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
    public void test09660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09660");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test09661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09661");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 10);
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
    public void test09662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09662");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09663");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (-1));
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test09664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09664");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test09665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09665");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
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
    public void test09666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09666");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test09667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09667");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09668");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test09669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09669");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test09670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09670");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) 'a');
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
    public void test09671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09671");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 0, 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aa#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aa#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, #, a]");
    }

    @Test
    public void test09672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09672");
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
    public void test09673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09673");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test09674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09674");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test09675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09675");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 100);
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
    public void test09676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09676");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray0, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09677");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09678");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test09679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09679");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test09680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09680");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test09681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09681");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 10);
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
    public void test09682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09682");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) '4');
        java.lang.Class<?> wildcardClass34 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test09683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09683");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) -1);
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
    public void test09684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09684");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test09685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09685");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test09686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09686");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test09687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09687");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test09688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09688");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test09689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09689");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test09690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09690");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test09691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09691");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09692");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (-1));
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
    public void test09693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09693");
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
    public void test09694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09694");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test09695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09695");
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
    public void test09696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09696");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
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
    public void test09697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09697");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test09698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09698");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09699");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
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
    public void test09700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09700");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09701");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
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
    public void test09702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09702");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '#');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09703");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '4');
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
    public void test09704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09704");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test09705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09705");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09706");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test09707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09707");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09708");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 1);
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
    public void test09709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09709");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) 'a');
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
    public void test09710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09710");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) '4');
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
    public void test09711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09711");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, 0);
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
    public void test09712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09712");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09713");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test09714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09714");
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
    public void test09715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09715");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass34 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test09716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09716");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
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
    public void test09717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09717");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
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
    public void test09718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09718");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09719");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
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
    public void test09720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09720");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test09721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09721");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) -1);
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
    public void test09722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09722");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09723");
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
        java.lang.Class<?> wildcardClass47 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test09724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09724");
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09725");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09726");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) ' ');
        java.lang.Class<?> wildcardClass41 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test09727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09727");
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
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test09728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09728");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 1);
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
    public void test09729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09729");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
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
    public void test09730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09730");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 100);
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
    public void test09731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09731");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, (int) (short) 0, 0);
    }

    @Test
    public void test09732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09732");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
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
    public void test09733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09733");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 0);
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
    public void test09734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09734");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09735");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09736");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09737");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09738");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test09739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09739");
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
    public void test09740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09740");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09741");
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
        java.lang.Class<?> wildcardClass38 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test09742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09742");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test09743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09743");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
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
    public void test09744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09744");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
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
    public void test09745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09745");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09746");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '#');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass32 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test09747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09747");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09748");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test09749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09749");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
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
    public void test09750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09750");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09751");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test09752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09752");
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
    public void test09753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09753");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (-1));
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
    public void test09754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09754");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test09755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09755");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 100);
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
    public void test09756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09756");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 0);
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
    public void test09757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09757");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 10);
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
    public void test09758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09758");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (-1));
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
    public void test09759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09759");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test09760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09760");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09761");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test09762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09762");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) '#');
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
    public void test09763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09763");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09764");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09765");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09766");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test09767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09767");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass36 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test09768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09768");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test09769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09769");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test09770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09770");
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
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test09771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09771");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test09772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09772");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09773");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass35 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test09774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09774");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 10);
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
    public void test09775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09775");
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
    public void test09776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09776");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test09777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09777");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test09778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09778");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
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
    public void test09779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09779");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test09780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09780");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09781");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test09782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09782");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) ' ');
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
    public void test09783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09783");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
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
    public void test09784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09784");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
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
    public void test09785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09785");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09786");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test09787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09787");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test09788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09788");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09789");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09790");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) 'a');
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
    public void test09791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09791");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 100);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test09792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09792");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09793");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (byte) 100);
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
    public void test09794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09794");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09795");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09796");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) ' ');
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
    public void test09797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09797");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09798");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09799");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test09800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09800");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test09801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09801");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test09802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09802");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test09803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09803");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test09804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09804");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test09805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09805");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) ' ');
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
    public void test09806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09806");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 1);
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
    public void test09807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09807");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '#');
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
    public void test09808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09808");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test09809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09809");
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
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test09810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09810");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) '4');
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
    public void test09811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09811");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09812");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09813");
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
    public void test09814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09814");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
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
    public void test09815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09815");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09816");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) -1);
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
    public void test09817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09817");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09818");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, 1);
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
    public void test09819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09819");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) (byte) 100);
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
    public void test09820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09820");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09821");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
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
    public void test09822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09822");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
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
    public void test09823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09823");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, 10, 10);
    }

    @Test
    public void test09824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09824");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '#');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09825");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
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
    public void test09826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09826");
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
    public void test09827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09827");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test09828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09828");
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
    public void test09829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09829");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test09830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09830");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test09831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09831");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 100);
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
    public void test09832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09832");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test09833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09833");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09834");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 1);
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
    public void test09835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09835");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test09836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09836");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass30 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test09837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09837");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test09838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09838");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09839");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '4', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aa#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aa#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, #, a]");
    }

    @Test
    public void test09840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09840");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 0);
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
    public void test09841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09841");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test09842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09842");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09843");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test09844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09844");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test09845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09845");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
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
    public void test09846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09846");
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
    public void test09847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09847");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
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
    public void test09848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09848");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test09849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09849");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
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
    public void test09850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09850");
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
        java.lang.Class<?> wildcardClass37 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test09851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09851");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09852");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test09853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09853");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test09854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09854");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 100);
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
    public void test09855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09855");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        java.lang.Class<?> wildcardClass24 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test09856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09856");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (-1));
        java.lang.Class<?> wildcardClass29 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test09857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09857");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (short) 1);
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
    public void test09858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09858");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
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
    public void test09859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09859");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
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
    public void test09860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09860");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
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
    public void test09861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09861");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09862");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09863");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test09864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09864");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09865");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test09866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09866");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09867");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 10);
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
    public void test09868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09868");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test09869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09869");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) '4');
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
    public void test09870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09870");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test09871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09871");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09872");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test09873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09873");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
    }

    @Test
    public void test09874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09874");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test09875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09875");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09876");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) '#');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a, #]");
    }

    @Test
    public void test09877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09877");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) ' ');
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
    public void test09878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09878");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '4', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, a, a, a]");
    }

    @Test
    public void test09879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09879");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass33 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test09880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09880");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test09881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09881");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (short) -1);
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
    public void test09882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09882");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test09883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09883");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test09884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09884");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 1);
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
    public void test09885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09885");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
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
    public void test09886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09886");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test09887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09887");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) '#');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test09888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09888");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
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
    public void test09889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09889");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test09890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09890");
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
    public void test09891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09891");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 10);
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
    public void test09892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09892");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test09893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09893");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test09894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09894");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
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
    public void test09895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09895");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09896");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass20 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test09897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09897");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 1);
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
    public void test09898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09898");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09899");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 100);
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
    public void test09900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09900");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '#');
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
    public void test09901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09901");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test09902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09902");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test09903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09903");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
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
    public void test09904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09904");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) 10);
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
    public void test09905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09905");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) '#');
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
    public void test09906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09906");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test09907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09907");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test09908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09908");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, a, a, a]");
    }

    @Test
    public void test09909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09909");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass18 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a#aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a#aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, #, a, a]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test09910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09910");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test09911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09911");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09912");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 10);
        java.lang.Class<?> wildcardClass25 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test09913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09913");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test09914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09914");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        java.lang.Class<?> wildcardClass38 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test09915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09915");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 10);
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
    public void test09916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09916");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aa#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aa#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, #, a]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09917");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 100);
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
    public void test09918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09918");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test09919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09919");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (byte) 100, (int) '#');
        com.thealgorithms.strings.Rotation.reverse(charArray4, 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (short) 100);
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
    public void test09920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09920");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) '4');
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
    public void test09921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09921");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        java.lang.Class<?> wildcardClass16 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09922");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
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
    public void test09923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09923");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass38 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test09924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09924");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09925");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass22 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test09926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09926");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (int) '#');
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
    public void test09927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09927");
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
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test09928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09928");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) 'a');
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
    public void test09929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09929");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, 1);
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
    public void test09930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09930");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test09931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09931");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test09932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09932");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
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
    public void test09933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09933");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test09934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09934");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09935");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09936");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
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
    public void test09937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09937");
        char[] charArray0 = null;
        com.thealgorithms.strings.Rotation.reverse(charArray0, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test09938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09938");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
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
    public void test09939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09939");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09940");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (-1));
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
    public void test09941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09941");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
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
    public void test09942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09942");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 10);
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
    public void test09943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09943");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass23 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test09944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09944");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a, #,  ]");
    }

    @Test
    public void test09945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09945");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09946");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09947");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (byte) 100);
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
    public void test09948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09948");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test09949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09949");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
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
    public void test09950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09950");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 10);
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
    public void test09951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09951");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09952");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09953");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
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
    public void test09954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09954");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (byte) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 10);
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
    public void test09955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09955");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test09956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09956");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test09957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09957");
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
    public void test09958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09958");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test09959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09959");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) -1, 10);
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
    public void test09960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09960");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test09961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09961");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 100);
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
    public void test09962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09962");
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
    public void test09963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09963");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09964");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09965");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  , #]");
    }

    @Test
    public void test09966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09966");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 10);
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
    public void test09967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09967");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , a]");
    }

    @Test
    public void test09968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09968");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
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
    public void test09969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09969");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray4, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) 'a', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aa#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aa#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, #, a]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test09970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09970");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09971");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
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
    public void test09972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09972");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }

    @Test
    public void test09973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09973");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09974");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 10);
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
    public void test09975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09975");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09976");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (-1), 100);
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
    public void test09977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09977");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test09978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09978");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        java.lang.Class<?> wildcardClass17 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09979");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) '4');
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
    public void test09980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09980");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 1);
        java.lang.Class<?> wildcardClass19 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test09981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09981");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, (int) 'a');
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
    public void test09982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09982");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        java.lang.Class<?> wildcardClass26 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test09983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09983");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 1, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        java.lang.Class<?> wildcardClass27 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test09984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09984");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) '#');
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
    public void test09985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09985");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (-1));
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, 4]");
    }

    @Test
    public void test09986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09986");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  , #]");
    }

    @Test
    public void test09987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09987");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) 'a');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 100, (int) (short) 10);
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
    public void test09988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09988");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) '#');
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
    public void test09989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09989");
        char[] charArray3 = new char[] { ' ', '#', '4' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test09990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09990");
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
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09991");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '4', 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ,  ]");
    }

    @Test
    public void test09992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09992");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 10, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) ' ', (int) ' ');
        com.thealgorithms.strings.Rotation.rotation(charArray3, 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        java.lang.Class<?> wildcardClass31 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test09993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09993");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '#' };
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) '#', 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray4, 0, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray4, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.rotation(charArray4, 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "aaa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "aaa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, a, a, #]");
    }

    @Test
    public void test09994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09994");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 1, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 100);
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
    public void test09995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09995");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09996");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 0, 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, 100);
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) '4');
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test09997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09997");
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
        com.thealgorithms.strings.Rotation.reverse(charArray3, 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, a,  ]");
    }

    @Test
    public void test09998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09998");
        char[] charArray1 = new char[] { ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray1, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.strings.Rotation.rotation(charArray1, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray1, 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.strings.Rotation.reverse(charArray1, 1, (int) '#');
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
    public void test09999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09999");
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
    public void test10000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test10000");
        char[] charArray3 = new char[] { '#', ' ', ' ' };
        com.thealgorithms.strings.Rotation.reverse(charArray3, 100, (int) (short) 100);
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) 'a', (int) (byte) 0);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (-1));
        com.thealgorithms.strings.Rotation.rotation(charArray3, (int) (byte) 1);
        com.thealgorithms.strings.Rotation.reverse(charArray3, (int) '#', (int) (byte) 1);
        com.thealgorithms.strings.Rotation.rotation(charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #,  ]");
    }
}

