package MergeSortNoExtraSpace;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 0, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (byte) 1, 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) -1, 1, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, 1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, 10, 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, 0, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 0, (int) 'a');
        java.lang.Class<?> wildcardClass26 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (short) 100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) -1, (int) (byte) 1, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (-1), (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (-1), (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 1, (byte) 0, (byte) -1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 1, 97, -1]");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        int[] intArray0 = new int[] {};
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 100, 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, 100, (int) (short) 10, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (byte) 1, 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', 1, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) ' ', 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) ' ', (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) (short) 1, 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) '4', (int) (byte) -1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass36 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) -1, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, 10, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, 0, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) (short) 1, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (byte) 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) ' ', 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (short) -1, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', 10, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) 'a', (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 47, -1, -1, 97]");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) (short) 0, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (byte) 10, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, 0, 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        java.lang.Class<?> wildcardClass31 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, 100, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) (short) 10, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (-1), (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 2, -1, -1, 97]");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 1, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (byte) 10, (int) (byte) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) '4', (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass34 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) '#', 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass31 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) ' ', (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) (short) 0, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (byte) 1, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (byte) -1, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, -1, -1, 97]");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, -1, 0, 97]");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (short) 100, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), (int) (short) -1, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (short) 100, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (byte) 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) ' ', 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) '#', (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (-1), (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass37 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (-1), (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (byte) 1, (-1), 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 0, -1, 16]");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) 100, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1150, 0]");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) ' ', (int) ' ', (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 1, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass37 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) 100, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 0, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) '4', (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 1, (int) (byte) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        java.lang.Class<?> wildcardClass35 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (short) -1, (int) (short) 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (short) 10, (-1), (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, 45, 97]");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) 'a', (int) (short) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 0, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (-1), (int) '4');
        java.lang.Class<?> wildcardClass30 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (short) 1, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) -1, (int) (byte) 0, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        int[] intArray0 = new int[] {};
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 10, (int) (short) -1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 0, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) ' ', (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 1]");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) 'a', (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, 1, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (int) '#', (int) (byte) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) -1, (int) (byte) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 10, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (byte) -1, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, (int) (short) 0, (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass35 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) (short) 10, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (byte) 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (short) 100, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) (short) 0, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) '4', (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) (byte) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        java.lang.Class<?> wildcardClass19 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        int[] intArray0 = null;
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) (byte) 10, (int) (byte) 1, (-1), (int) (short) -1);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        int[] intArray1 = new int[] { 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 1, (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, (int) (byte) 1, 0, 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, (int) (short) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 10, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -33, -6, -1, 97]");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', 0, (-1), (int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 10, (int) (short) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) -1, 0, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 1, (int) (short) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) '4', (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -11, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 1, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 10, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (-1), (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (-1), (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (short) 10, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) '#', (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 1, (int) (short) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, 0, 97]");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) '4', (int) (short) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        java.lang.Class<?> wildcardClass28 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, 0, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 0, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (-1), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) -1, (int) (short) 0, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), (int) ' ');
        java.lang.Class<?> wildcardClass39 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, 0, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) (short) 1, (int) (short) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', (int) (byte) 10, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) '#', (int) (short) 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass44 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (byte) 10, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 1]");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 10, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass33 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (-1), (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, 1, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', 0, (int) (short) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 10, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', (-1), (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) ' ', 1);
        java.lang.Class<?> wildcardClass36 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) (byte) 10, 10, 10);
        java.lang.Class<?> wildcardClass46 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 1, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', (int) (short) 100, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) 100, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 0, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 0, -95, 97]");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, 10, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, (int) (short) 10, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) '4', (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (byte) 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (short) 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (byte) 1, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 0, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass30 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (-1), (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        int[] intArray0 = null;
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) ' ', (int) (short) 1, (int) (short) 1, (int) '#');
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (-1), (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) (byte) 0, 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) -1, 10);
        java.lang.Class<?> wildcardClass42 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 10, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (-1), (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) ' ', (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) '#', 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', 0, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        int[] intArray4 = new int[] { (byte) 0, (byte) 0, '#', (short) 100 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray4, (int) ' ', (-1), (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray4, (int) 'a', (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 35, 100]");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (-1), (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass43 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, 0, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) (short) 1, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (int) (byte) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) 'a', (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (short) 10, (-1), (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) -1, (int) (byte) -1, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        java.lang.Class<?> wildcardClass27 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 0, -5, 97]");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (byte) -1, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, -1, -1, 97]");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 0, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (short) 10, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass32 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (short) 100, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) '4', (int) (short) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (short) 0, (int) 'a');
        java.lang.Class<?> wildcardClass32 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 7]");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) -1, 10, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        int[] intArray0 = new int[] {};
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 100, 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, 100, (int) (short) 10, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (-1), (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (byte) 100, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[391, -98, -98, -98, 97]");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (int) (byte) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (byte) 10, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) ' ', (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (byte) 1, (int) (short) 1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, (int) (short) 10, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 11 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (int) (byte) 10, (int) (short) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 0, (int) '4');
        java.lang.Class<?> wildcardClass37 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, 0, (int) (short) 1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (int) ' ', 0, (int) '4');
        java.lang.Class<?> wildcardClass47 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) (byte) 10, 1, (-1));
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) '#', 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (-1), (-1), (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 48]");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, 10, (byte) 10, (-1) };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (byte) -1, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 10, -1]");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) '#', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (byte) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 0, (-1));
        java.lang.Class<?> wildcardClass30 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 1, (int) (byte) -1, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass34 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass34 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 100, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, (int) (byte) -1, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1150, -36, -36, -36, 1042]");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 100, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, (int) (byte) 1, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) -1, (int) (byte) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) '#', (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 36 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, 0, (int) (short) -1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -33, -6, -1, 29]");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        int[] intArray1 = new int[] { 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 1, (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, (int) (byte) 1, 0, 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, (int) (short) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 10, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, 0, (int) (byte) 10, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass29 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 47, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 1, (int) (short) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass26 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -11, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 1, (int) (byte) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, 10, 0);
        java.lang.Class<?> wildcardClass35 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (-1), (int) (byte) -1);
        java.lang.Class<?> wildcardClass39 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) (byte) 1, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass32 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 47, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (byte) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (byte) -1, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (short) 0, (int) (byte) 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 1, 10, 10]");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (-1), (-1));
        java.lang.Class<?> wildcardClass42 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (-1), (int) 'a');
        java.lang.Class<?> wildcardClass25 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) ' ', (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 11, 10, 10, 11]");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 1, 1, (int) (short) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (short) -1, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) ' ', (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', 1, 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) '#', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, 0, (int) '#');
        java.lang.Class<?> wildcardClass29 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) -1, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, 10, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, -11, -11, 167]");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) (byte) 0, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) (short) 10, (int) (short) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (-1), (int) (short) 100);
        java.lang.Class<?> wildcardClass29 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', 10, (int) '#');
        java.lang.Class<?> wildcardClass39 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', 1, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) '4', (int) '#');
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, 100, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '#');
        java.lang.Class<?> wildcardClass35 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, 1, 1);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 1, (int) ' ');
        java.lang.Class<?> wildcardClass19 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 1, (int) (short) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) 'a', (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -11, -1, -1, 97]");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (byte) 0, (int) (byte) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) ' ', (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) (byte) -1, (int) '4');
        java.lang.Class<?> wildcardClass32 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        java.lang.Class<?> wildcardClass31 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (short) 1, (int) (short) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (-1), 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, -36, -1, -1, 97]");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 1, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) 1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 10, 10, 10]");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (byte) -1, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        int[] intArray1 = new int[] { 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 1, (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, (int) (byte) 1, 0, 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 0, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) -1, (int) (byte) 100, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        int[] intArray1 = new int[] { 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 1, (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, (int) (byte) 1, 0, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 2, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) ' ', (int) ' ', (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, 1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, 10, 0, 100);
        java.lang.Class<?> wildcardClass34 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass27 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 1, 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (byte) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) -1, (int) (byte) 10, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, -1, -1, 97]");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 1, 0);
        java.lang.Class<?> wildcardClass30 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (-1), (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass34 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (-1), (-1), (int) (byte) 10);
        java.lang.Class<?> wildcardClass35 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) -1, (int) (byte) 1, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) (short) 100, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, (int) (short) -1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 10, (int) '4', (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (-1), (int) ' ', 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) 10, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (short) 0, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) (short) 100, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 2, -1, -1, 97]");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (short) -1, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (short) 10, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (byte) 0, (int) (byte) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 0, (int) '#');
        java.lang.Class<?> wildcardClass30 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) '4', (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) '#', (int) (short) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) -1, 100, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (byte) 1, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 10, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) '#', (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) '4', (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, 1, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) -1, (int) (short) -1, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (-1), (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) (short) 0, (int) (short) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, 0, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (byte) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (-1), (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) 'a', (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 10, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass35 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) '#', 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) 'a', (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, 0, (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 10, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) -1, (int) (short) 0, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) ' ', (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (short) 1, 100);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (short) 100, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 0, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (-1), (int) ' ', 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (byte) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) (short) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 10, (int) (byte) 1, (int) (short) -1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) -1, (int) (short) -1, 10);
        java.lang.Class<?> wildcardClass41 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        int[] intArray1 = new int[] { 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, (int) ' ', (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, 1);
        java.lang.Class<?> wildcardClass12 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 1, 100, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 1, 100, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, 10, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 0, (int) 'a');
        java.lang.Class<?> wildcardClass34 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) 10, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) ' ', (int) (short) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 1]");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (byte) 0, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) '#', 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (-1), (-1), (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, (int) (byte) 10, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 11 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (-1), (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (byte) 1, (-1), 1);
        java.lang.Class<?> wildcardClass40 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) '#', (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[228, 0]");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (byte) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass40 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', (int) (byte) 0, (int) (short) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, 1, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (-1), 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, 45, 97]");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) ' ', (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) '4', (int) (short) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, (int) 'a', 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (-1), (int) (short) 10, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', 1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (int) (byte) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, 10, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) ' ', (int) ' ', (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '4', (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        int[] intArray1 = new int[] { 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, (int) ' ', (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, (int) (byte) 1, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) ' ', (int) ' ', (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass34 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 1, (-1), (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass41 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (byte) 10, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass26 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (byte) 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (short) 100, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (-1), (int) '4');
        java.lang.Class<?> wildcardClass39 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 1, (int) (byte) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 100, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        java.lang.Class<?> wildcardClass27 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (-1), 1);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (short) 0, (int) (byte) 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (int) (short) -1, (int) ' ');
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        int[] intArray0 = null;
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, (int) (byte) 1, 0, 0);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 10, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) (short) -1, (-1), (int) '4');
        java.lang.Class<?> wildcardClass32 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (byte) -1, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (-1), (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) ' ', (int) ' ', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) (byte) 1, 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) -1, (int) (byte) 100, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 2, -1, -1, 97]");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) ' ', 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) 'a', (int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', (int) '4', (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (-1), (int) ' ');
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (-1), (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, (int) (byte) 0, (int) (short) -1, 100);
        java.lang.Class<?> wildcardClass40 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (byte) 10, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 1]");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 100, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (-1), (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (byte) 10, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, (int) '#', 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 10, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) -1, (int) (short) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) 'a', 0);
        java.lang.Class<?> wildcardClass41 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (byte) 0, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (-1), (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (-1), (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) -1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) -1, (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass34 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) 'a', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (-1), 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) -1, (int) (byte) 1, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, 0, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 1, (int) '4', (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', (int) '4', 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) ' ', (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) (short) 1, 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) -1, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) '#', 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (-1), (-1), (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), 0, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (short) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, 0, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (byte) -1, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (-1), 0);
        java.lang.Class<?> wildcardClass27 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) -1, (int) (byte) 100, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 0, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        java.lang.Class<?> wildcardClass19 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, 1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, 10, 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 100, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) '4', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', (-1), (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, 0, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) ' ', (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', 1, 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) '#', (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        java.lang.Class<?> wildcardClass30 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 0, -1, 16]");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', 100, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 10, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        java.lang.Class<?> wildcardClass19 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 1, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) 'a', 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, 0, 3, 1]");
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        int[] intArray0 = null;
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, 10, 0, (int) (byte) -1, 10);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        int[] intArray0 = new int[] {};
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 100, 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) (byte) -1, (int) 'a', 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (short) 100, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', 10, (int) (short) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass34 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        int[] intArray1 = new int[] { 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 1, (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, (int) (byte) 1, 0, 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 1, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass40 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) (short) -1, 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) ' ', 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) ' ', (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass35 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 47, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 1, 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (byte) -1, (int) '4');
        java.lang.Class<?> wildcardClass34 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 0, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (-1), (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (byte) -1, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass35 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, 0, 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass30 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass30 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) (byte) 10, 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass28 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 0, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) -1, (int) (short) -1, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, 0, (int) (short) -1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 1, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (int) (byte) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) -1, (int) (byte) -1, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, (int) (byte) 1, (int) (short) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 100, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 10, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 11 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (byte) -1, (int) (short) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, 10, 10, 1);
        java.lang.Class<?> wildcardClass33 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, -101, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        int[] intArray1 = new int[] { 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 1, (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, (int) (byte) 1, 0, 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 0, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) 100, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass51 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (byte) 1, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) ' ', (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) (short) 1, 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) '4', (int) (byte) -1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (byte) 100, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) (short) 1, (int) (short) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) -1, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', (int) '4', (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 1, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, (int) (short) 1, (-1), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 1]");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', (int) ' ', 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 0, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass26 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (-1), (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (short) 10, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1150, 0]");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) ' ', (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (short) 10, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) '#', 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (byte) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (-1), (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (byte) 1, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) '4', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, 1, (int) (short) 0, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        int[] intArray1 = new int[] { 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 1, (-1), (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, (int) '#', (int) ' ', (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (-1), (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (short) 10, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 100, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) ' ', (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) (short) 1, 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, (int) '#', (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        int[] intArray0 = new int[] {};
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 10, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 0, (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, (int) (short) 0, (-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, 0, (int) (byte) 10, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) '#', 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (-1), 1);
        java.lang.Class<?> wildcardClass33 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) ' ', (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) (byte) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', 0, (int) (byte) -1, 100);
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) '4', (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1010, 0]");
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) '#', (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) ' ', (int) ' ', (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, 100, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (byte) 1, (int) (short) 1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', (int) '4', (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 10, (int) (short) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) (short) -1, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 0, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (-1), (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (byte) 0, (int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass35 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 10, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) ' ', (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) 10, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) 'a', 0);
        java.lang.Class<?> wildcardClass20 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 1, 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (byte) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, -99, -1, 97]");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        java.lang.Class<?> wildcardClass37 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass36 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (-1), (int) ' ');
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, 10);
        java.lang.Class<?> wildcardClass33 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass26 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, 100);
        java.lang.Class<?> wildcardClass23 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, (int) (byte) 10, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) ' ', (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) -1, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, (int) '#', (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1150, -36, -36, -36, 1042]");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) ' ', (int) ' ', (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 1, (int) ' ');
        java.lang.Class<?> wildcardClass30 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (short) 1, (int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass33 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, -36, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, 0, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (-1), 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', 0, (int) (byte) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', (-1), (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) ' ', (int) ' ', (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (-1), (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (-1), 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 0, 0);
        java.lang.Class<?> wildcardClass33 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        java.lang.Class<?> wildcardClass22 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, 10, (byte) 10, (-1) };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 0, (int) '#');
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 10, -1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) (short) 10, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) '#', 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -101, -101, -101, 9797]");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (byte) -1, (int) (short) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (int) (short) 0, (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, -101, -1, 97]");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) '4', (int) '4', (int) (byte) 100);
        java.lang.Class<?> wildcardClass28 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (byte) 0, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (short) -1, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, -1, 0, 97]");
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        int[] intArray1 = new int[] { 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, (int) ' ', (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) 'a', (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (short) -1, (int) (short) 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (short) 10, (-1), (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass36 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) ' ', (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        int[] intArray0 = new int[] {};
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 100, 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, (int) (byte) 10, 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (int) (byte) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (byte) 1, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 0, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (-1), (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), (-1), 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) '4', (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '#', (int) (byte) 0);
        java.lang.Class<?> wildcardClass33 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (short) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) '4', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (int) '#', (int) (byte) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) '#', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) '#', (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) (short) -1, (int) (short) 100, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass35 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        int[] intArray0 = new int[] {};
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 100, 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, (int) (byte) 10, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) 'a', 10, (int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 10, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) -1, (int) (short) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (short) 1, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        java.lang.Class<?> wildcardClass33 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (byte) -1, (int) (byte) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        int[] intArray1 = new int[] { 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 1, (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, (int) (byte) 1, 0, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, (int) (byte) -1, (int) (short) 0, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        int[] intArray4 = new int[] { (byte) 0, (byte) 0, '#', (short) 100 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray4, (int) ' ', (-1), (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray4, (int) 'a', (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray4, 1, (int) (short) 0, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 35, 100]");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (-1), (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, 0, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, 0, 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (-1), 1);
        java.lang.Class<?> wildcardClass41 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', 0, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) (short) -1, 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (byte) 100, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (short) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) (short) 100, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), 1, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (-1), (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', 100, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 0, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }
}

