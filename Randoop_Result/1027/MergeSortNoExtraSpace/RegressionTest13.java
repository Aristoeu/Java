package MergeSortNoExtraSpace;

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
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 0, -95, 97]");
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) -1, (int) 'a', (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (short) -1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 1, (int) (byte) 100, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 1, (int) (byte) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) -1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), (int) '#', (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 100, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 16, -1, -1, 97]");
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, (int) (short) -1, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) (short) 1, 1, 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 10, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (-1), 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, 0, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[4, -1, -1, -1, 97]");
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 10, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 0, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass36 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) '4', 0, 1);
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
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 10, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (-1), (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (byte) 10, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) -1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, 100, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 1, 100);
        java.lang.Class<?> wildcardClass34 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 10, (int) (byte) 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) -1, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) 'a', (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (-1), (int) (byte) 10, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 10, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', 10, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 10, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (byte) 1, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 10, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass44 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (-1), (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (short) 10, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass32 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (byte) 10, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 1, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (byte) -1, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-100, -1, 10, 10, 1]");
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) -1, (int) (short) 100, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, 0, 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (byte) -1, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (short) 0, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, -1, -1, 97]");
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (short) 1, 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass32 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', (int) (short) 100, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', 10, (-1));
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
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
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
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, 1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 10, 10, 1]");
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) 100, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '4', (int) '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) ' ', (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 10, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) ' ', (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (byte) 1, (int) (short) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) (short) 100, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (byte) 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) '4', (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (short) 1, (int) (byte) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) ' ', (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, 1, (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, -1, -1, 97]");
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (short) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 10, 10, 1]");
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (byte) 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) (short) -1, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[2596, 0]");
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) '#', (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (short) 1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (-1), (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) '4', (int) (short) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, 10, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) (byte) -1, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, (int) (byte) 0, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, 0, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 1, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 10, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 10, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (-1), (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass40 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (-1), (int) (byte) 0);
        java.lang.Class<?> wildcardClass43 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-100, 1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
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
        java.lang.Class<?> wildcardClass43 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 10, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 10, 0, (int) (byte) 10);
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
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 10, 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', (int) ' ', 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 47, -1, -1, 97]");
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) '4', (int) (byte) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (short) 10, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) ' ', (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) -1, (int) (short) 0, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', (int) '#');
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
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 10, (int) (short) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, (int) (short) 100, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (short) 1, (int) (byte) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', 0, 10);
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
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass39 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (byte) 1, 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', 1, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) (byte) -1, (int) '4');
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (-1), (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) '4', 1);
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 1, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass35 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', (int) (byte) -1, (-1), (int) (short) -1);
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
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (short) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) '4', (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (byte) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) '#', (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -101, -101, -101, 9797]");
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (short) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 100, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (byte) -1, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 47, 4699, 9899, 9997]");
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, 100, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[980, 0]");
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (short) -1, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -33, -6, -1, 97]");
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) (short) 1, (int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (byte) -1, (-1), 10);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (-1), (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) (short) -1, (int) (byte) -1, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (-1), (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (byte) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (byte) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) '#', (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[391, 0]");
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 1, (-1), (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) ' ', 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 10, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -11, -11, -11, 167]");
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass30 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) '4', (int) (byte) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        java.lang.Class<?> wildcardClass29 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (-1), (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), (-1), (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (short) 0);
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
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (-1), (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (-1), (int) 'a');
        java.lang.Class<?> wildcardClass27 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) '4', 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) 'a', (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 1, (-1));
        java.lang.Class<?> wildcardClass30 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 1, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, (int) (short) 1, (-1), (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 1, (int) (byte) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', (int) (short) 1, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -101, -1, -1, 97]");
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 10, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (short) -1, 0, 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, -1, -1, 97]");
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (-1), (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (short) 10, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) '#', (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        int[] intArray1 = new int[] { 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 1, (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, (int) (byte) 1, 0, 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, (int) (short) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, (int) (byte) 1, (int) (short) 1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass30 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 10, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 1, (int) (byte) 10);
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
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) '4', (int) (byte) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) 'a', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (short) 1, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) 100, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (short) 100, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) '#', (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) '#', (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) '#', 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (short) 0, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (short) -1, 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 10, (int) (short) -1, (int) (short) -1, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (-1), 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) ' ', (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, 0, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', 0, (-1), (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) 10, (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) (byte) 10, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', 10, 10, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, (int) (byte) 0, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) '#', 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (-1));
        java.lang.Class<?> wildcardClass37 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 10, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) ' ', (-1), (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (-1), (-1), (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        java.lang.Class<?> wildcardClass47 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (-1), (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) '4', 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 0, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (byte) 0, (int) (byte) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (byte) 1, (int) (short) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 1, (int) (byte) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        java.lang.Class<?> wildcardClass41 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) ' ', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 0, -1, 16]");
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (-1), 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (byte) 10, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (short) -1, (int) (short) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (-1), 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -49, 97]");
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 0, (-1));
        java.lang.Class<?> wildcardClass25 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) '#', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (short) 1, (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (-1), (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 10, (int) (byte) -1, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 10, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (-1), (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass40 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 10, 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 10, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 10, (int) (short) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        java.lang.Class<?> wildcardClass23 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) -1, (int) (short) -1, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', 0, (-1), (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) -1, (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, (int) (byte) 0, (int) (short) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', 0, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, 1, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 1, 1, (int) (short) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 0, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (-1), (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 0, -95, 97]");
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) -1, (int) '4', 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) (byte) 1, 100);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (byte) 100, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
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
        java.lang.Class<?> wildcardClass58 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (-1), (int) (short) 1, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', 1, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) 'a', (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) (byte) 10, 0, 1);
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
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 1, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, 10, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 11, 10, 10, 11]");
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 10, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 0, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) '4', (int) '4', (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (byte) -1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) (short) 10, (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -88, 97]");
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', 1, (int) (byte) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (-1), (int) (short) 1, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) 'a', (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', 0, (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (-1), (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (byte) 10, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-100, 1, -1, -1, 97]");
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 100, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (-1), (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
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
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) (short) 0);
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
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, (int) (byte) 10, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) (byte) -1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -101, -1, -1, 97]");
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 0, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, 10, (byte) 10, (-1) };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) -1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 100, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (int) '#', (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 10, -1]");
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, 1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) (byte) 10, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
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
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) -1, (int) (short) 0, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (-1), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (-1), (int) (short) 1, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, 0, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', 0, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 10, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, 10, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 1, 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (-1), (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) -1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, -1, -1, 97]");
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) '4', (int) (short) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, 10, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (-1), (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (short) -1, (int) ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) ' ', (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 1, 100, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (byte) 10, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        java.lang.Class<?> wildcardClass26 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, 10, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (-1), (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) '#', 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (byte) 1, 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) -1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) (byte) 1, 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (short) 10, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[360, 0]");
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 1, 1, 2]");
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', 0, (int) (short) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) (short) -1, (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) -1, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (short) 0, (int) (byte) 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 1, (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 10, 10, 1]");
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) '#', (int) (byte) 100);
        java.lang.Class<?> wildcardClass43 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, 0, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (-1), 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (-1), (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) '#', (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) ' ', (int) ' ', (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) ' ', (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', 1, 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) '#', (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (byte) 0, (-1), (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) (byte) 1, 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) -1, (int) (byte) 1, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 2, -1, -1, 97]");
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) -1, (int) (byte) 1, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass26 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (short) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) -1, 0);
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
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (short) 10, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) (byte) 0, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) (short) 1, 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) '4', (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[101, 0]");
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 10, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass39 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (-1), (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', (int) (byte) 10, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (short) 0, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 1, 1, (int) (short) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 0, 100);
        java.lang.Class<?> wildcardClass42 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (byte) 1, (int) '4');
        java.lang.Class<?> wildcardClass24 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) '4', (int) '4', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) -1, 0, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass37 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (short) -1, (int) (short) 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
        int[] intArray0 = new int[] {};
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 10, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) '#', (int) (byte) 1, 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) 'a', 1, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, (int) (short) 1, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, (-1), (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) -1, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 1, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) ' ', 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', 0, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (int) (short) 0, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) -1, (-1), (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) (short) -1, (int) '#', 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) ' ', (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, 1, (int) (short) -1, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, (int) '4', 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) '4', (int) (byte) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) ' ', (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, (int) (byte) 0, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[132, 129, 330, 330, 33]");
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) '4', 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, 0, (int) (byte) -1, (int) (byte) -1);
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
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '4', (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, (-1), (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 0, 96, 99]");
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) 10, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) 'a', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (int) (byte) 10, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 1]");
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) (byte) 0, (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', 10, 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 100, 0);
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
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', (-1), (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, 0, 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass32 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 0, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (byte) 1, 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (short) 1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, 10, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) 'a', (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (-1), (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) '4', (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -11, -11, -11, 167]");
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) '#', (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 0, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, 10, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 10, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', 10, 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (-1), (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[391, -98, -98, -98, 97]");
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, (int) (byte) 10, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 100, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) -1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) -1, (int) (short) -1, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) 10, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass35 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (byte) -1, (int) (short) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (-1), (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, -101, -1, 97]");
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
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
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (byte) 1, (int) (short) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, (int) ' ', (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
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
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (-1), (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (-1), 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (short) 1, (int) (short) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) ' ', 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) 'a', (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 1, (int) '4');
        java.lang.Class<?> wildcardClass50 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) (byte) 1, (int) ' ', (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) (short) -1, 10, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (byte) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) (byte) 1, (int) 'a', 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) (short) -1, 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (-1), (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 1, (byte) 0, (byte) -1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 1, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (short) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) ' ', (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) (short) 1, 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 0, 0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 1]");
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) -1, (int) (byte) 0, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (short) 0, (int) ' ');
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
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
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
        java.lang.Class<?> wildcardClass32 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (byte) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) -1, (int) (byte) 0, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (byte) 10, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (short) 0, 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass39 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) -1, 0, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
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
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) -1, 100);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) '4', (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 1, (byte) 0, (byte) -1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 1, 97, -1]");
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, 100, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, 0, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, 0, 97]");
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 10, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) ' ', (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 10, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
        int[] intArray0 = null;
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, (int) '4', (int) (short) 10, (int) ' ');
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) ' ', (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) -1, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 10, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) (byte) 1, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) (short) 10, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, (-1), 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 0, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 2556]");
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) '#', 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, 0, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), (int) (short) 0, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) '#', 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass27 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 0, 1);
        java.lang.Class<?> wildcardClass41 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass26 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        java.lang.Class<?> wildcardClass15 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (-1), (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (-1), (int) (byte) 100);
        java.lang.Class<?> wildcardClass37 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 10, (int) (short) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 0, 100);
        java.lang.Class<?> wildcardClass25 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) '#', 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (-1), (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 10, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2, 3, -1, -1, 97]");
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 1, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 10, 100);
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
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (byte) -1, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) '#', (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, 0, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[228, -1, -1, -1, 97]");
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 0, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (-1), (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (byte) 0, (int) (short) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, 0, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (-1), (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (byte) -1, (int) (short) 0, (-1));
        java.lang.Class<?> wildcardClass40 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 10, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, (-1), (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 10, (int) '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) ' ', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) -1, (int) (short) 0, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 100, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) ' ', (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) '#', (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (short) 1, 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), (int) '#', (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (short) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', 0, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) (short) -1, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (short) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        java.lang.Class<?> wildcardClass29 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', 0, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass32 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, 10, 10, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (short) 10, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) '4', (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 10, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 100, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 10, (int) (short) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 2, -1, -1, 97]");
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (-1), (int) (byte) -1, (int) '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6850");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 1, (int) (byte) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        java.lang.Class<?> wildcardClass33 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6851");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (-1), (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6852");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 10, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (-1), (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, 10, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6853");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) '#', (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6854");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 10, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', 10, 1, (int) ' ');
        java.lang.Class<?> wildcardClass41 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6855");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 10, (int) (short) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), (int) (short) -1, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6856");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 0, 100);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6857");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) ' ', (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (-1), (-1), (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6858");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 0, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', 10, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) -1, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6859");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (byte) 10, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, -1, -1, 97]");
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6860");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, 0, 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6861");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) '#', 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass29 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6862");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) '#', 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) -1, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6863");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, (int) (byte) 1, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6864");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
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
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6865");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6866");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) -1, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test6867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6867");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 10, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (int) (byte) 10, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6868");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, 0, (-1), (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', 0, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6869");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 0, (int) ' ');
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6870");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (byte) 0, (int) (byte) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        java.lang.Class<?> wildcardClass34 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6871");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6872");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, 0, (-1), (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (byte) -1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (-1), (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6873");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) -1, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6874");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) ' ', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) '#', 10);
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
    public void test6875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6875");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 100, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 10, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (short) -1, (int) (byte) -1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) -1, (int) (short) 100, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6876");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6877");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (byte) -1, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) '#', 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-22, -1, -1, 0, 97]");
    }

    @Test
    public void test6878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6878");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (-1), (-1), (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) -1, (int) (byte) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), 0, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6879");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 10, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) 'a', (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6880");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, 0, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 10, (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6881");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 1, 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, 0, (int) (short) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), (int) '4', 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, -1, -1, 97]");
    }

    @Test
    public void test6882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6882");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, 1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (byte) 1, (int) (short) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass34 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6883");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 10, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test6884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6884");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test6885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6885");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) '4', (int) (byte) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (short) 1, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6886");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (-1), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test6887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6887");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (short) -1, (int) (short) 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6888");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
    }

    @Test
    public void test6889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6889");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 47, -1, -1, 97]");
    }

    @Test
    public void test6890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6890");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6891");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 0, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 0, 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, 1, 97]");
    }

    @Test
    public void test6892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6892");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) ' ', 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) 'a', (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (-1), 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6893");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6894");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test6895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6895");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 10, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (short) 1, (int) (short) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (-1), 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, 100, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -36, -1, -1, 97]");
    }

    @Test
    public void test6896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6896");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, 10, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test6897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6897");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (short) 10, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) -1, (int) (short) -1, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6898");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6899");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) (short) 1, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6900");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        java.lang.Class<?> wildcardClass47 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test6901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6901");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (short) -1, 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test6902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6902");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass33 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6903");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) '4', 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        java.lang.Class<?> wildcardClass28 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6904");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 10, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (-1), (-1), (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6905");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) (byte) 10, 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (-1), (-1), (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6906");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) '4', (int) (short) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, 10, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6907");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', (int) (short) 1);
        java.lang.Class<?> wildcardClass33 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6908");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) ' ', (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6909");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) '#', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, (int) (short) 1, 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) (byte) 100, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[4, -1, -1, -1, 97]");
    }

    @Test
    public void test6910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6910");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test6911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6911");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (short) -1, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, 1, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, -1, -1, 97]");
    }

    @Test
    public void test6912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6912");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6913");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
    }

    @Test
    public void test6914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6914");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        java.lang.Class<?> wildcardClass29 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 47, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6915");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, 100, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6916");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) (short) 10, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        java.lang.Class<?> wildcardClass28 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6917");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
    }

    @Test
    public void test6918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6918");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (-1), (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6919");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 10, (int) (short) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (int) (short) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) (short) 100, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test6920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6920");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (byte) 1, 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', 1, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) ' ', 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) (byte) 1, 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6921");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (byte) -1, (int) (short) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (byte) 10, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, -111, -11, 167]");
    }

    @Test
    public void test6922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6922");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) (byte) 1, (int) (byte) 1, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6923");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (-1), (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass35 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test6924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6924");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, 0, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, (-1), (int) (byte) 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 128]");
    }

    @Test
    public void test6925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6925");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) 'a', 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -11, -11, -11, 167]");
    }

    @Test
    public void test6926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6926");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (-1), (int) (short) -1, (int) '4');
        java.lang.Class<?> wildcardClass34 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6927");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 1, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6928");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) '4', (int) (short) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, 10, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, (int) '#', 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6929");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) (short) 1, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, 0, (int) (byte) 1);
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
    public void test6930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6930");
        int[] intArray4 = new int[] { (byte) 0, (byte) 0, '#', (short) 100 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray4, (int) ' ', (-1), (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray4, (int) 'a', (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray4, (int) ' ', 0, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 35, 100]");
    }

    @Test
    public void test6931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6931");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (-1), (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6932");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, 100, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
    }

    @Test
    public void test6933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6933");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) (short) -1, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) '4', 10, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test6934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6934");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 10, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, 0, (int) (byte) 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (-1), (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
    }

    @Test
    public void test6935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6935");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6936");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6937");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 10, 10, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6938");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (short) 1, (int) (byte) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        java.lang.Class<?> wildcardClass36 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test6939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6939");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, (-1), 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (short) 1, (int) (byte) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) 10, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 2496]");
    }

    @Test
    public void test6940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6940");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) '#', 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass33 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6941");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) ' ', (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, -1, -1, 97]");
    }

    @Test
    public void test6942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6942");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 10, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, 0, (int) (byte) 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (short) 1, 100);
        java.lang.Class<?> wildcardClass42 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test6943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6943");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 10, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass31 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6944");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, 10, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', (-1), (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6945");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) '4', (int) '4', (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, 10, (int) (short) -1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) '#', (-1), (-1));
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6946");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) ' ', (int) (byte) 100);
        java.lang.Class<?> wildcardClass41 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test6947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6947");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, 10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6948");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (byte) 0, (int) (byte) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) -1, 10, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6949");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (byte) -1, (int) (short) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, 10, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6950");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 1, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test6951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6951");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (short) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) (short) 1, (-1), (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6952");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6953");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (-1), 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) '#', 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6954");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 0, (-1), (int) '4');
        java.lang.Class<?> wildcardClass52 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-100, 1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test6955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6955");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, 1, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6956");
        int[] intArray0 = null;
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, (int) (short) 0, (int) (short) -1, 1);
    }

    @Test
    public void test6957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6957");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, (-1), (int) (byte) 0, (int) (byte) -1);
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
    public void test6958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6958");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 1]");
    }

    @Test
    public void test6959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6959");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (byte) 1, (int) (short) 1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 1, (-1));
        java.lang.Class<?> wildcardClass30 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6960");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) '4', (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 46, -1, 46]");
    }

    @Test
    public void test6961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6961");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        java.lang.Class<?> wildcardClass28 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6962");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass44 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test6963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6963");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (short) 1, (-1), (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6964");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 10, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) '4', (int) (byte) 0);
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
    public void test6965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6965");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) 100, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 10, (int) 'a', (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6966");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) ' ', (int) ' ', (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', 0, (-1), (-1));
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
    public void test6967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6967");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) 10, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 10, 10, 100]");
    }

    @Test
    public void test6968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6968");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', 100, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6969");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6970");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), (int) '#');
        java.lang.Class<?> wildcardClass21 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6971");
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
        java.lang.Class<?> wildcardClass40 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6972");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6973");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6974");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) '#', (int) (short) 0);
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
    public void test6975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6975");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
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
    public void test6976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6976");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) -1, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
    }

    @Test
    public void test6977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6977");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6978");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test6979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6979");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (-1), (-1), (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) '#', (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6980");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 1, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (short) 100, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test6981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6981");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6982");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) 'a', (int) (short) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test6983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6983");
        int[] intArray0 = null;
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, (int) (byte) 100, (int) (byte) 10, 10);
    }

    @Test
    public void test6984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6984");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (short) -1, (int) (short) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, 0, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-99, -9901, -101, -101, 9797]");
    }

    @Test
    public void test6985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6985");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) '4', (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6986");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) ' ', (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6987");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (-1), (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) '4', (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -11, -11, -11, 167]");
    }

    @Test
    public void test6988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6988");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) '#', (int) (short) 0, 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6989");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 0, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test6990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6990");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 10, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) -1, 10, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test6991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6991");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', 1, (-1));
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6992");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 1, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 100, 1]");
    }

    @Test
    public void test6993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6993");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (short) -1, 1);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6994");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 10, (int) (byte) 0, (int) (short) 0, (int) (short) -1);
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
    public void test6995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6995");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test6996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6996");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
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
    public void test6997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6997");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, 0, (-1), (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (byte) -1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass30 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6998");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (short) 10, 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test6999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6999");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) ' ', (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test7000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test7000");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) -1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) -1, (int) (short) 10, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }
}

