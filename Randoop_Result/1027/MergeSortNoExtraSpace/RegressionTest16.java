package MergeSortNoExtraSpace;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test8001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8001");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, 10, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8002");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8003");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', 1, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8004");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 1, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', 10, (int) (short) 0, 0);
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
    public void test8005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8005");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
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
    public void test8006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8006");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 10, 0, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8007");
        int[] intArray0 = null;
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 100, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test8008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8008");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8009");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) ' ', (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8010");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (short) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8011");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 10, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8012");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass32 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test8013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8013");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, 0, 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8014");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (-1), 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8015");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) (short) 1, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 10, 10);
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test8016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8016");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) 'a', (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8017");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 100, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) (short) 100);
        java.lang.Class<?> wildcardClass26 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8018");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (-1), (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8019");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) -1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 10, 100);
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
    public void test8020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8020");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (-1), (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8021");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 1, (int) (byte) -1, (int) '#');
        java.lang.Class<?> wildcardClass39 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -36, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test8022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8022");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8023");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '4', (int) (short) 1);
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
    public void test8024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8024");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (byte) -1, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) '#', (int) (byte) 10);
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
    public void test8025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8025");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8026");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8027");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8028");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (byte) -1, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (short) 1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        java.lang.Class<?> wildcardClass34 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test8029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8029");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 10, 0, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8030");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, (int) (byte) 1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 100, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8031");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8032");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 10, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (short) 10, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8033");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) 'a', (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, 0, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8034");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8035");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
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
    public void test8036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8036");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 0, (-1));
        java.lang.Class<?> wildcardClass32 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test8037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8037");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 10, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (short) 10);
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
    public void test8038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8038");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (byte) 1, (int) (byte) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) ' ', 10, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 100, 101, 1]");
    }

    @Test
    public void test8039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8039");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (-1), (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8040");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8041");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', 10, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8042");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) (byte) 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, 100, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8043");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 1, (int) 'a');
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
    public void test8044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8044");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (short) -1, (int) (short) 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (short) 10, (-1), (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        java.lang.Class<?> wildcardClass34 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test8045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8045");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) (byte) 1, (int) (short) 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) 'a', 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8046");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8047");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 1, (int) (short) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, 0, (int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass30 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8048");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) '#', 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', 0, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8049");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 100, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8050");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[4, 4, 10, 10, 1]");
    }

    @Test
    public void test8051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8051");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, 0, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, (-1), (int) (byte) 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) (short) 10, 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass38 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 128]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test8052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8052");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8053");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, (int) (byte) 1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (short) 1, (int) (short) 10);
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
    public void test8054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8054");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (int) (short) 10, (-1), (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 0, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8055");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        java.lang.Class<?> wildcardClass16 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8056");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (short) 10, 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8057");
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 1, (byte) 0, (byte) -1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 1, 29, -1]");
    }

    @Test
    public void test8058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8058");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (short) -1, (int) (short) 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (short) 10, (-1), (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8059");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 0, -5, 97]");
    }

    @Test
    public void test8060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8060");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (-1), (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
    }

    @Test
    public void test8061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8061");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8062");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 1, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test8063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8063");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (byte) 1, 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', 1, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', 10, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) 'a');
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
    public void test8064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8064");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) 'a', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8065");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) '#', (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 1, 0, 0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8066");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, (int) (byte) 1, (int) (short) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), (int) (short) 100, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8067");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, 10, (int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass26 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8068");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) -1, (int) (byte) 10, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8069");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8070");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 2496]");
    }

    @Test
    public void test8071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8071");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8072");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 10, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[391, 0]");
    }

    @Test
    public void test8073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8073");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', 100, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8074");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) ' ', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) (short) -1, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8075");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8076");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
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
    public void test8077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8077");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass38 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test8078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8078");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (-1), (int) (short) 10);
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test8079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8079");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', 0, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', 10, (-1), (int) '4');
        java.lang.Class<?> wildcardClass39 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test8080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8080");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
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
    public void test8081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8081");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (-1), (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8082");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
    }

    @Test
    public void test8083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8083");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) '4', 100);
        java.lang.Class<?> wildcardClass30 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8084");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) '4', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8085");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8086");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) '4', (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8087");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) (short) 0, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8088");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, 0, 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (byte) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (byte) 10, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8089");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 1, (int) (short) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, 0, (int) (short) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) '4', 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, -1, -1, 97]");
    }

    @Test
    public void test8090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8090");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 1, 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, 0, (int) (byte) 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (byte) -1, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass39 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -101, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test8091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8091");
        int[] intArray1 = new int[] { 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, (int) ' ', (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, (int) (byte) 0, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
    }

    @Test
    public void test8092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8092");
        int[] intArray0 = null;
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) (byte) 1, (int) (byte) 0, (int) (short) -1, 100);
    }

    @Test
    public void test8093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8093");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8094");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (byte) 1, (int) (byte) -1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, 1, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 101, 10, 10, 1]");
    }

    @Test
    public void test8095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8095");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (-1), (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (short) 0, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8096");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (short) 1, (int) (byte) 0);
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
    public void test8097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8097");
        int[] intArray2 = new int[] { (short) 0, (short) 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 10, (int) (byte) 1, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, (int) (short) 100, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1010]");
    }

    @Test
    public void test8098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8098");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test8099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8099");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8100");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', 1, (-1), (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, 1, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, (int) (byte) -1, 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8101");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 1, (int) (byte) 10, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8102");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (-1), (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        java.lang.Class<?> wildcardClass37 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test8103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8103");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) -1, (int) (short) 0, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8104");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        java.lang.Class<?> wildcardClass23 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8105");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8106");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', 1, 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8107");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (short) 0, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-100, -1, 10, 10, 1]");
    }

    @Test
    public void test8108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8108");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', 0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8109");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, 0, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8110");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) '#', (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8111");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8112");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) ' ', (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) -1, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8113");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 100, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8114");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) -1, (int) (short) 10, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test8115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8115");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), 100, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8116");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) (byte) 10, (int) (byte) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, 100, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8117");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (short) 10, 0, (int) (byte) -1);
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
    public void test8118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8118");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), (int) (byte) 100, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8119");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 0, -96, 97]");
    }

    @Test
    public void test8120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8120");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) '#', (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8121");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) -1, 10, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8122");
        int[] intArray1 = new int[] { 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 1, (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, (int) (byte) 1, 0, 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, (int) (short) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 0, (-1), (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 10, (int) (short) 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
    }

    @Test
    public void test8123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8123");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (short) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8124");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) 100, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8125");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8126");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8127");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8128");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass37 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test8129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8129");
        int[] intArray0 = new int[] {};
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 10, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 0, (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, (int) (short) 0, (-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, 0, (int) 'a', (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test8130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8130");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 1, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, (int) (short) 1, (-1), (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, (int) (short) -1, (int) (byte) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, 10, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test8131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8131");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8132");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) (short) 1, 10, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8133");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) ' ', (int) ' ', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (short) 100, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -11, -11, -11, 167]");
    }

    @Test
    public void test8134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8134");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) ' ', (int) (short) -1, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8135");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (short) 0, (int) (byte) 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) '#', (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 1, 10, 10]");
    }

    @Test
    public void test8136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8136");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) ' ', (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) (short) 1, 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8137");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8138");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, (int) (byte) 0, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, -1, -1, 97]");
    }

    @Test
    public void test8139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8139");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', (int) ' ', (int) (byte) -1, (int) '4');
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
    public void test8140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8140");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (short) 0, (int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) '#', (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8141");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (int) '#', (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (short) 100, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8142");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) (byte) -1, (int) (byte) -1, (int) (short) 10);
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
    public void test8143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8143");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 0, 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8144");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8145");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (short) 0, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8146");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) -1, (int) ' ', (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8147");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 1, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) 1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) ' ', (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 10, 10, 1]");
    }

    @Test
    public void test8148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8148");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (byte) -1, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8149");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) ' ', (int) (short) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        java.lang.Class<?> wildcardClass30 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8150");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 2, -1, -1, 97]");
    }

    @Test
    public void test8151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8151");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8152");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 2496]");
    }

    @Test
    public void test8153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8153");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 1, (int) (short) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) (byte) 1, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8154");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (byte) 1, (int) (byte) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) ' ', 10, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (-1), (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 101, 10, 10, 1]");
    }

    @Test
    public void test8155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8155");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (-1), (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8156");
        int[] intArray0 = null;
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, (int) (short) 0, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test8157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8157");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, 1, (int) (byte) 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 11, 10, 10, 1]");
    }

    @Test
    public void test8158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8158");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (int) '#', (int) (short) 0, (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8159");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 10, (int) ' ');
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
    public void test8160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8160");
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
    public void test8161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8161");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) ' ', (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) (short) 1, 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 1, -1, 1]");
    }

    @Test
    public void test8162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8162");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
    }

    @Test
    public void test8163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8163");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
    }

    @Test
    public void test8164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8164");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test8165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8165");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (short) 10, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8166");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (short) 0, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8167");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 1, 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (byte) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -99, -1, -1, 97]");
    }

    @Test
    public void test8168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8168");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 10, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8169");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', 1, (-1), (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, 1, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, (int) (byte) -1, 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8170");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) -1, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8171");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) ' ', (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 1, (int) (short) -1, (int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) '#', (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8172");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 100, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) '4', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) -1, (int) (byte) 100, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8173");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', (int) (byte) 1, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8174");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8175");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (-1), (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8176");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (short) -1, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8177");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, 10, (int) (byte) -1);
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
    public void test8178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8178");
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
    public void test8179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8179");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (-1), (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) (byte) 10, (int) (short) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass36 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test8180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8180");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (short) -1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8181");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 10, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
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
    public void test8182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8182");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) '#', (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 1, (int) (short) -1, (-1), 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8183");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (-1), (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (-1), (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '#', (-1));
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
    public void test8184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8184");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (byte) 1, (int) (byte) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) ' ', 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) ' ', (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 101, 10, 10, 1]");
    }

    @Test
    public void test8185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8185");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) '#', (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8186");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (short) 0, (-1), (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass30 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8187");
        int[] intArray3 = new int[] { (byte) -1, (byte) 10, '#' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray3, 1, (-1), (int) (short) 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray3, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray3, 1, (-1), (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray3, (int) (byte) 10, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -10, 35]");
    }

    @Test
    public void test8188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8188");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) '4', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, 0, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8189");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
    }

    @Test
    public void test8190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8190");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) ' ', (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8191");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 1, (int) (short) -1, (int) (short) 0, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8192");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) -1, 10, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8193");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) -1, (int) (byte) 100);
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
    public void test8194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8194");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) (short) 1, (int) (byte) -1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) 'a', 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8195");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) (byte) -1, (int) ' ', (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8196");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
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
    public void test8197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8197");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 10, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, 1, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-100, -1, 10, 10, 1]");
    }

    @Test
    public void test8198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8198");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (int) '#', (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8199");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
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
    public void test8200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8200");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) '#', 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, (int) (byte) 100, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8201");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (-1), (int) (byte) 100, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8202");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8203");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8204");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8205");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8206");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (-1), (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) -1, 100);
        java.lang.Class<?> wildcardClass35 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test8207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8207");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 0, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) (byte) 10);
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
    public void test8208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8208");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 10, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, -1, 0, 97]");
    }

    @Test
    public void test8209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8209");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, 1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass34 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test8210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8210");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, 10, (int) (short) 10, (int) (short) 1);
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
    public void test8211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8211");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, (int) ' ', (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1150, -36, -36, -36, 1042]");
    }

    @Test
    public void test8212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8212");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (short) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test8213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8213");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 1, (-1), (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass26 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8214");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8215");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8216");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 10, (int) (byte) 0, 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, 10, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8217");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, 0, (-1), (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (byte) -1, (int) ' ');
        java.lang.Class<?> wildcardClass28 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test8218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8218");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) ' ', (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', 1, 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8219");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (short) 10, 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (short) 10, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8220");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (-1), (-1), (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) '#', (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) '#');
        java.lang.Class<?> wildcardClass36 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test8221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8221");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (-1), (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (byte) -1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8222");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (-1), 0);
        java.lang.Class<?> wildcardClass35 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test8223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8223");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) '#', (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8224");
        int[] intArray1 = new int[] { 10 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray1, 1, (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, (int) (byte) 1, 0, 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, (int) 'a', (int) (short) 10, (int) (byte) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray1, (int) ' ', (int) '#', (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
    }

    @Test
    public void test8225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8225");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) -1, (int) (short) 10, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8226");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 1, (-1), (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8227");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8228");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) ' ', (int) ' ', (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, (int) (byte) 10, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8229");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (byte) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) (short) 0, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8230");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (-1), (int) (short) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (short) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        java.lang.Class<?> wildcardClass30 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8231");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8232");
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
    public void test8233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8233");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) (byte) 1, 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8234");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
    }

    @Test
    public void test8235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8235");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 0, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8236");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 0, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 11, 10, 10, 11]");
    }

    @Test
    public void test8237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8237");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass33 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8238");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 10, (-1));
        java.lang.Class<?> wildcardClass39 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test8239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8239");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (short) 0, 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8240");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 10, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, 10, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8241");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) ' ', (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) -1, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (byte) 0, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 1, 1, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8242");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) 'a', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, 1, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
    }

    @Test
    public void test8243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8243");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) ' ', (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8244");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (byte) 10, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8245");
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
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test8246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8246");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', 10, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8247");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) (short) 1, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, 0, (int) '4');
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
    public void test8248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8248");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8249");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (-1), 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8250");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) ' ', (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (short) -1, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8251");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) 'a', (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass26 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8252");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8253");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, (int) 'a', (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8254");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, (int) '#', (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8255");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (byte) 0, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8256");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (byte) 0, (int) (short) 100);
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
    public void test8257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8257");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) -1, (int) (byte) 10);
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
    public void test8258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8258");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 10, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8259");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) (byte) 10, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 0, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
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
    public void test8260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8260");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8261");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 2, -1, -1, 97]");
    }

    @Test
    public void test8262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8262");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 10, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8263");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) -1, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8264");
        int[] intArray0 = new int[] {};
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 10, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 0, (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, (int) (short) 0, (-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) (short) -1, 0, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test8265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8265");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 10, 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 0, (int) '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8266");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), (int) ' ', (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8267");
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
        java.lang.Class<?> wildcardClass45 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test8268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8268");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
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
    public void test8269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8269");
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
        java.lang.Class<?> wildcardClass39 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test8270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8270");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) '#', (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) -1, 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8271");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8272");
        int[] intArray0 = null;
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, (int) (short) 100, 1, (int) 'a');
    }

    @Test
    public void test8273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8273");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8274");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (-1), 0, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8275");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) -1, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-100, 1, -1, -1, 97]");
    }

    @Test
    public void test8276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8276");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) ' ', 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8277");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) (short) -1, 10, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8278");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) (short) 10, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test8279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8279");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) 10, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) ' ', (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (-1), (int) (byte) -1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test8280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8280");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (byte) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (-1), (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8281");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (byte) 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8282");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 0, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8283");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8284");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 10, 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (byte) 0, (-1), (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8285");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) ' ', (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test8286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8286");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, 10, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 1, (-1), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (byte) 0, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8287");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (byte) 1, (int) (short) -1, 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -101, -1, -1, 97]");
    }

    @Test
    public void test8288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8288");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) ' ', 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) 'a', (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 10, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', 1, (int) '#');
        java.lang.Class<?> wildcardClass48 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test8289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8289");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', 10, 10, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8290");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) 'a', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) (short) -1, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8291");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test8292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8292");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) '#', (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8293");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 100, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[391, 0]");
    }

    @Test
    public void test8294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8294");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass34 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test8295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8295");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) 'a', (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 100, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8296");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 0, (int) '4');
        java.lang.Class<?> wildcardClass25 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test8297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8297");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) -1, (int) (short) -1, (int) (short) 100);
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
    public void test8298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8298");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 1, 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (-1), (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, -1, -1, 97]");
    }

    @Test
    public void test8299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8299");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, 10, (byte) 10, (-1) };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) ' ', (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10, 10, -1]");
    }

    @Test
    public void test8300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8300");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, 0, (int) '#', (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8301");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8302");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) ' ', 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8303");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) -1, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), 0, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8304");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 10, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
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
    public void test8305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8305");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 100, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) '#', (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (byte) 100, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[391, -98, -98, -98, 97]");
    }

    @Test
    public void test8306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8306");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (byte) 10, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass34 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test8307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8307");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, 0, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (byte) 0, (-1), (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8308");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, 45, 97]");
    }

    @Test
    public void test8309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8309");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (short) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
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
    public void test8310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8310");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test8311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8311");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (byte) 100, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8312");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', 0, (-1), (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8313");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8314");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test8315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8315");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 100, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) (short) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (short) 100, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8316");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (short) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) '#', (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8317");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) (short) 1, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', 0, 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (short) 10, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8318");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (-1), (int) (short) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) (short) 100, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8319");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 0, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8320");
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
    public void test8321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8321");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8322");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) ' ', (int) (byte) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) -1, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 10, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8323");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 1, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-32, 0]");
    }

    @Test
    public void test8324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8324");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test8325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8325");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, 0, (-1), 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8326");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (-1), (int) (byte) 0, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8327");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 1, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8328");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', (int) (byte) 0, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 0, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8329");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (-1), (-1), (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8330");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8331");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass48 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -36, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test8332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8332");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', 10, 10, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (byte) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
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
    public void test8333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8333");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-3, 0, -97, -1, 97]");
    }

    @Test
    public void test8334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8334");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, (int) (short) 0, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8335");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (-1), (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) -1, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8336");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
    }

    @Test
    public void test8337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8337");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) ' ', (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (short) 0, (-1), (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8338");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (short) 1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (-1), (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8339");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) '#', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) (byte) 10, (int) (short) 10, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', 10, (int) (byte) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass32 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test8340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8340");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) ' ', (int) (short) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
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
    public void test8341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8341");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass38 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test8342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8342");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (-1), (int) (short) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (-1), (int) (byte) -1, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 291]");
    }

    @Test
    public void test8343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8343");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (short) -1, (int) (short) 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8344");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, 0, (int) (short) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) '#', 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (byte) 10, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 0, (int) '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8345");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 10, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) '4', (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass36 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test8346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8346");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass43 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test8347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8347");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 1, 10, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8348");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (byte) 100, (int) (short) 0);
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
    public void test8349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8349");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
    }

    @Test
    public void test8350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8350");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8351");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) (byte) 1, (-1), (int) '4');
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[2596, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8352");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 10, (int) (short) 1);
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
    public void test8353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8353");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 10, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) ' ', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', 1, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8354");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8355");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (byte) 10, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass32 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test8356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8356");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass36 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test8357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8357");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) ' ', (int) (byte) 1, (int) (short) 100);
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
    public void test8358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8358");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8359");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, 0, (-1), (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) (short) 0, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8360");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 1, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 10, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 10, 10, 1]");
    }

    @Test
    public void test8361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8361");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8362");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) (byte) 1, 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, 1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (int) (short) -1, 100);
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
    public void test8363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8363");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '4', (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (byte) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8364");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (-1), (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8365");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', 0, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) (short) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (-1), (int) (byte) 100, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8366");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (short) 1, (int) (byte) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) (byte) 0, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8367");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, (int) (short) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8368");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, (int) (byte) 0, (-1), (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) ' ', 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8369");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8370");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (short) -1, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8371");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, 1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) 'a', (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (short) 10, 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8372");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) 1, 100);
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
    public void test8373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8373");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8374");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, (int) (byte) 10, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8375");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (-1), (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8376");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8377");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8378");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 0, -1, 97]");
    }

    @Test
    public void test8379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8379");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
    }

    @Test
    public void test8380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8380");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass31 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test8381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8381");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, 0, (int) (byte) 0, (int) (byte) 1);
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
    public void test8382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8382");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8383");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) ' ', (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (short) 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 10, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) -1, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8384");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) (byte) 100, 1, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8385");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8386");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) '4', (int) (short) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (-1), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (short) -1, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8387");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (-1), (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8388");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 10, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass39 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test8389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8389");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8390");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) ' ', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 0, (int) (byte) 1, (int) (short) 0, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 0]");
    }

    @Test
    public void test8391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8391");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8392");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) -1, (int) (byte) 0, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8393");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8394");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) ' ', (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, 10, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8395");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, 1, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (-1), 0);
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
    public void test8396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8396");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) ' ', (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8397");
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
        java.lang.Class<?> wildcardClass43 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test8398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8398");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) (byte) 10, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) 'a', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', 0, 100);
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
    public void test8399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8399");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        java.lang.Class<?> wildcardClass29 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8400");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', 10, (int) (short) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) '4', (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 101, 1010, 1010, 101]");
    }

    @Test
    public void test8401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8401");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
    }

    @Test
    public void test8402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8402");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (byte) 0, 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (-1), 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, 0, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 29, -1, -1, 97]");
    }

    @Test
    public void test8403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8403");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 1, (int) 'a', (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8404");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) '4', (int) (short) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8405");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) ' ', (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8406");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8407");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (short) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, 100, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8408");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 1, (int) 'a');
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8409");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) ' ', (int) (short) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8410");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8411");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (int) (short) 0, (int) 'a');
        java.lang.Class<?> wildcardClass23 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8412");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (short) 1, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[49, 0]");
    }

    @Test
    public void test8413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8413");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (-1), (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
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
    public void test8414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8414");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (-1), (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test8415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8415");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', 0, (int) (short) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8416");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8417");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, 100, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
    }

    @Test
    public void test8418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8418");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 0, 0, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (byte) 10, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (short) 1, (int) (short) -1, (int) '#');
        java.lang.Class<?> wildcardClass40 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -36, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test8419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8419");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 0, -1, 16]");
    }

    @Test
    public void test8420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8420");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
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
    public void test8421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8421");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), (int) (short) 1, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8422");
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
        java.lang.Class<?> wildcardClass50 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test8423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8423");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8424");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, (int) (byte) 1, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) ' ', (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass34 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test8425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8425");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (-1), (int) (short) -1, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) (short) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) -1, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8426");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) -1, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 0, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) '4', (int) (byte) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (int) 'a', (int) (byte) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass26 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8427");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8428");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) (byte) 10, 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (-1), (-1), (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) '#', (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8429");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', 1, (int) (byte) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, (int) (short) 0, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, 0, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8430");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (short) 100, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8431");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) -1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 0, 0, (int) (short) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) '#', (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8432");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (short) 10, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8433");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, (int) '4', (-1), (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', (int) ' ', (int) (byte) 10, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) '#', (int) (short) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 1, (int) (short) 0, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8434");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) ' ', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) '#', 10);
        java.lang.Class<?> wildcardClass33 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8435");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (byte) 0, (int) (byte) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (short) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (short) 100, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8436");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 1, 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (byte) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) ' ', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, -1, -1, 97]");
    }

    @Test
    public void test8437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8437");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '4', (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        java.lang.Class<?> wildcardClass29 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8438");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8439");
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
        java.lang.Class<?> wildcardClass35 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test8440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8440");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
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
    public void test8441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8441");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test8442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8442");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, 1, 1, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8443");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) 10, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[4, 4, 10, 10, 1]");
    }

    @Test
    public void test8444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8444");
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
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 10, 10, 10]");
    }

    @Test
    public void test8445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8445");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 0, (int) (byte) -1, (int) (short) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8446");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) -1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8447");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, 1, (int) (short) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) '4', (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, (-1), (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 0, (int) (short) 1, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -11, -1, -1, 97]");
    }

    @Test
    public void test8448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8448");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) ' ', (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8449");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass51 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test8450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8450");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (byte) 10, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) (byte) 100, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8451");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 10, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8452");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) -1, (int) (short) 0, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8453");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) -1, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test8454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8454");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) '#', 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8455");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-3, -1, 0, -97, 97]");
    }

    @Test
    public void test8456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8456");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (int) (short) 1, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8457");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, 0, 0, 0);
        java.lang.Class<?> wildcardClass39 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test8458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8458");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (short) 10, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 10, 10, 1]");
    }

    @Test
    public void test8459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8459");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 100, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (-1), (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) 'a', (int) (short) 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 0, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8460");
        int[] intArray5 = new int[] { 100, (short) 1, 10, 10, 1 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 100, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '#', (int) (byte) 1, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) 10, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 0, (-1), (int) (short) 0, (int) 'a');
        java.lang.Class<?> wildcardClass42 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test8461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8461");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) 'a', (int) (short) 1, 0, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, (int) (byte) 0, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8462");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) '#', (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 10, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) 10, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (short) 0, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8463");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 1, (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8464");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, 0, (-1), (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 0, 0, (int) (short) 1);
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
    public void test8465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8465");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 100, (int) '4', (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (byte) 1, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, 10, (int) (byte) 0, (int) (short) 1);
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
    public void test8466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8466");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (-1), (-1), (int) (short) 1);
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
    public void test8467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8467");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass46 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test8468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8468");
        int[] intArray0 = new int[] {};
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, 100, 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, 100, (int) (short) 10, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray0, (int) '#', (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test8469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8469");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (-1), (int) (byte) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (int) (byte) 10, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', (int) '4', (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8470");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
    }

    @Test
    public void test8471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8471");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, 1, 100);
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
    public void test8472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8472");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8473");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) ' ', (int) (byte) 10, 0, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '#', (int) ' ', (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 1, (int) (byte) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, 0, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8474");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (short) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass57 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test8475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8475");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray0, (int) ' ', 100, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8476");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (int) (short) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) ' ', (int) 'a', (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8477");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8478");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 100, 1, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, (int) (short) -1, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8479");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), (int) (short) 0, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8480");
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
    public void test8481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8481");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (short) 1, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) -1, (-1), (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8482");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) '4', (int) (byte) 1, 0, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (-1), (int) (byte) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 10, 0, 0, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 2, -1, -1, 97]");
    }

    @Test
    public void test8483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8483");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) -1, (int) (short) -1, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 2, -1, -1, 97]");
    }

    @Test
    public void test8484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8484");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (short) 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 100, (int) (short) 0, (int) (short) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 1, 0, 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8485");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (byte) 0, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, 10, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8486");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 10, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 1, (int) (byte) 0, (int) (byte) -1, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 10, 1, (int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass31 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test8487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8487");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, 0, 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) -1, (-1), (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8488");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (-1), 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) (byte) 100, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 100, (int) 'a', (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (byte) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (short) 10, (int) (byte) 100, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8489");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) (short) 100, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) (short) -1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, (-1), 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (-1), (int) (byte) 10, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8490");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 100, (int) ' ', 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, (int) '4', (int) (short) -1, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 100, 10, (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '4', (int) (byte) 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8491");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) '#', (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) ' ', (-1), (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 0);
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
    public void test8492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8492");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, 0, (int) '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8493");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, (-1), 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 10, 10, (int) (byte) 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 100, (int) ' ', (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8494");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, 100, 100, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8495");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 1, (int) (short) -1, (int) ' ');
        java.lang.Class<?> wildcardClass48 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test8496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8496");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (byte) 100, (int) '#', 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, 1, 1, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) 'a', (int) (byte) 1, 10);
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
    public void test8497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8497");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 10, (int) (byte) 1, 1, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 10, (int) (byte) 10, (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) 'a', 10, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) '#', (int) (byte) -1, (-1), (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
    }

    @Test
    public void test8498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8498");
        int[] intArray5 = new int[] { 100, (short) -1, (byte) -1, (short) -1, 'a' };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (short) 1, (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, 1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 10, 10, (int) 'a');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray5, (int) (short) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray5, (int) (short) 100, (int) (byte) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray5, 0, 10, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, -1, 97]");
    }

    @Test
    public void test8499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8499");
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
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) '4', 0, 100);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.implement_merge_sort(intArray2, (int) (byte) 0, (int) (byte) 0, (-1), (int) '#');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1150, 0]");
    }

    @Test
    public void test8500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8500");
        int[] intArray2 = new int[] { 100, 0 };
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 1, 0, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) ' ', (int) (short) 1, (int) '4');
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, 0, (int) (short) 0, 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, 0);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 10, 10, (int) (short) 10);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.merge_sort(intArray2, (int) (short) 0, 1, (int) (short) -1);
        com.thealgorithms.sorts.MergeSortNoExtraSpace.call_merge_sort(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass35 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }
}

