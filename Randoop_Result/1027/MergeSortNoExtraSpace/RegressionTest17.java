package MergeSortNoExtraSpace;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test8501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8501");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', 0, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8502");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8503");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 0, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 3]");
    }

    @Test
    public void test8504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8504");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) -1, 100, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8505");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test8506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8506");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 10, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass38 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test8507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8507");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (-1), 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) -1, (int) (byte) 100, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8508");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (short) -1, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, (int) (short) 1, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, -1, -1, 97]");
    }

    @Test
    public void test8509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8509");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, 1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (int) (short) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test8510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8510");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (byte) -1, (int) (byte) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass42 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test8511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8511");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (byte) 0, 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -96, -69, -1, 97]");
    }

    @Test
    public void test8512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8512");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8513");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) (short) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8514");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (-1), (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8515");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8516");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (-1), 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (-1), (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8517");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test8518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8518");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) '#', (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8519");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8520");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, -1, -1, 97]");
    }

    @Test
    public void test8521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8521");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) 100, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8522");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 0, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) ' ', 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8523");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) '#', (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (short) 1, 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8524");
        int[] intArray1 = new int[] { 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 1, (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, (int) (byte) 1, 0, 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, (int) (byte) 100, (int) (byte) 10, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
    }

    @Test
    public void test8525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8525");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) -1, (int) (byte) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (short) 1, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) '#', 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[2596, 0]");
    }

    @Test
    public void test8526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8526");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (-1), (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 0, (-1));
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
    public void test8527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8527");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (byte) -1, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, -1, -1, 97]");
    }

    @Test
    public void test8528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8528");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) -1, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8529");
        int[] intArray1 = new int[] { 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, (int) ' ', (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, (int) (byte) 10, (int) (byte) -1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, (int) (short) 10, (-1), (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
    }

    @Test
    public void test8530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8530");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (short) 0, (-1), (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, (int) (short) -1, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8531");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', 100, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8532");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8533");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) (short) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test8534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8534");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) ' ', 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) 'a', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, (int) (short) 100, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8535");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, 0, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8536");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, 0, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (byte) 1, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8537");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (-1), (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, 100);
        java.lang.Class<?> wildcardClass39 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test8538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8538");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (-1), (-1));
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
    public void test8539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8539");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 10, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', (int) (byte) 1, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, 0, (int) (short) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) '4', 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8540");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 1, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8541");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8542");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass49 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test8543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8543");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 10, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8544");
        int[] intArray1 = new int[] { 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 1, (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, (int) (byte) 1, 0, 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, (int) (short) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 0, (-1), (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, (int) '4', 1, 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
    }

    @Test
    public void test8545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8545");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) ' ', (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 2491, -53, -53, 2437]");
    }

    @Test
    public void test8546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8546");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) '4', (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test8547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8547");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', 0, (-1), (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) -1, (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 0, 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8548");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) '#', 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (-1), (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8549");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 10, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        java.lang.Class<?> wildcardClass25 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test8550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8550");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (byte) 1, (int) (byte) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) ' ', 10, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 101, 10, 10, 1]");
    }

    @Test
    public void test8551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8551");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 10, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8552");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (-1), (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8553");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 0, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (-1), (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, 10, (int) (short) 1, (int) '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8554");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) (short) 10, 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8555");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) ' ', (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8556");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (int) (byte) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8557");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 10, (int) (short) 1, (int) (short) 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8558");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, 0, (int) (byte) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 0, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8559");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (byte) 1, 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, 1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) '#', (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) (byte) 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        java.lang.Class<?> wildcardClass46 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test8560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8560");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, 0, 1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8561");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (int) (short) -1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 10, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, (-1), (int) (short) 10);
        java.lang.Class<?> wildcardClass42 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test8562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8562");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (short) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test8563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8563");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, 0, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, (int) (short) -1, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 2, -1, -1, 97]");
    }

    @Test
    public void test8564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8564");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, 1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8565");
        int[] intArray0 = null;
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, (int) '#', (int) (short) 0, (-1));
    }

    @Test
    public void test8566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8566");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, 10, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8567");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) (short) 10, (int) (byte) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        java.lang.Class<?> wildcardClass26 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8568");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (-1), (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8569");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 10, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8570");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (byte) 10, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) 'a', 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (short) -1, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8571");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', 10, (int) (short) -1, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8572");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8573");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, 0, (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', 1, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8574");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test8575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8575");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 10, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1010, 0]");
    }

    @Test
    public void test8576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8576");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (byte) 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 10, 10, 100]");
    }

    @Test
    public void test8577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8577");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (byte) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 10, 0, (-1), (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) '#', (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8578");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (-1), (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8579");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) '#', 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (short) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test8580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8580");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) '#', 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (-1), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8581");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, 10, (byte) 10, (-1) };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, 1, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 10, -1]");
    }

    @Test
    public void test8582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8582");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 100, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, 1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass41 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test8583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8583");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8584");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) (byte) -1, (int) (byte) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test8585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8585");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 1, (int) (short) 1);
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
    public void test8586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8586");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) ' ', (int) ' ', (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (short) 1, (int) (short) 1, (-1));
        java.lang.Class<?> wildcardClass39 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-100, 1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test8587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8587");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) -1, (int) (byte) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) (byte) 0, 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) -1, (int) (byte) -1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', (int) (short) 0, (-1), (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
    }

    @Test
    public void test8588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8588");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (byte) 1, 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', 1, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', 10, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (-1), (int) (byte) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) 'a', 100);
        java.lang.Class<?> wildcardClass45 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }
}

